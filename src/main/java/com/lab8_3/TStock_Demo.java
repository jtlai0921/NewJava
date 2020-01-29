package com.lab8_3;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class TStock_Demo {
    public static void main(String[] args) throws Exception {
        //String source = getData().replace("\"", "");
        String source = getWebData("20200120").replace("\"", "");
        List<TStock> list = getTStockList(source);
        //System.out.println(list.size());
        Predicate<TStock> f1 = t -> !t.get本益比().trim().equals("-");
        Predicate<TStock> f2 = t -> !t.get股價淨值比().trim().equals("-");
        Predicate<TStock> f3 = t -> !t.get殖利率().trim().equals("-");
        
        Predicate<TStock> a1 = t -> Double.parseDouble(t.get本益比()) <= 10;
        Predicate<TStock> a2 = t -> Double.parseDouble(t.get殖利率()) >= 10;
        Predicate<TStock> a3 = t -> Double.parseDouble(t.get股價淨值比()) < 1;
        list.stream().filter(f1).filter(f2).filter(f3)
                .filter(a1)
                .filter(a2)
                .filter(a3)
                .forEach(System.out::println);
    }
    public static List<TStock> getTStockList(String source) {
        List<TStock> list = new ArrayList<>();
        String[] rows = source.split("\n");
        IntStream.range(2, rows.length).forEach((i) -> {
            // 9958,世紀鋼,0.42,107,24.84,3.49,108/3,
            String[] data = rows[i].split(",");
            if(data.length >= 7) {
                TStock ts = new TStock();
                ts.set證券代號(data[0]);
                ts.set證券名稱(data[1]);
                ts.set殖利率(data[2]);
                ts.set股利年度(data[3]);
                ts.set本益比(data[4]);
                ts.set股價淨值比(data[5]);
                ts.set財報年季(data[6]);
                list.add(ts);
            }
        });
        return list;
    }
    
    public static String getData() throws Exception {
        String path = "src\\main\\java\\com\\lab8_3\\BWIBBU_d.csv";
        InputStream is = new FileInputStream(path);
        Scanner sc = new Scanner(is, "big5").useDelimiter("\\A");
        return sc.next();
    }
    
    public static String getWebData(String yyyymmdd) throws Exception {
        String path = "https://www.twse.com.tw/exchangeReport/BWIBBU_d?response=csv&date=" + yyyymmdd + "&selectType=ALL";
        InputStream is = new URL(path).openStream();
        Scanner sc = new Scanner(is, "big5").useDelimiter("\\A");
        return sc.next();
    }
}
