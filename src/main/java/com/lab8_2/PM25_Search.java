package com.lab8_2;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class PM25_Search {
    public static void main(String[] args) throws Exception {
        //test();
        List<PM25> list = getPM25List();
        System.out.println(list);
        
        list.stream().filter(p -> p.getArea().equals("林口")).forEach(System.out::println);
        
        ToIntFunction<PM25> m1 = p -> 
                p.getValue1() == null || p.getValue1().trim().equals("") ? Integer.parseInt(p.getValue2().trim()) : Integer.parseInt(p.getValue1().trim());
        double avg = list.stream()
                .mapToInt(m1)
                .average().getAsDouble();
        System.out.println(avg);
        
        IntSummaryStatistics stat = list.stream()
                .mapToInt(m1)
                .summaryStatistics();
        System.out.println(stat);
        
    }
    
    public static List<PM25> getPM25List() throws Exception {
        Elements elements = getData();
        List<PM25> list = new ArrayList<>();
        for(int i=1;i<elements.size();i++) {
            Elements e = elements.get(i).select("td");
            String area = e.get(0).text();
            String value1 = e.get(1).text();
            String value2 = e.get(2).text();
            PM25 pm25 = new PM25(area, value1, value2);
            list.add(pm25);
        }
        return list;
    }
    
    public static Elements getData() throws Exception {
        String path = "https://taqm.epa.gov.tw/pm25/tw/PM25A.aspx?area=10";
        Document doc = Jsoup.connect(path).get();
        Elements elements = doc.select("table#ctl08_gv.TABLE_G").select("tr");
        return elements;
    }
    
    public static void test() throws Exception {
        String path = "https://taqm.epa.gov.tw/pm25/tw/PM25A.aspx?area=10";
        Document doc = Jsoup.connect(path).get();
        //System.out.println(doc.html());
        System.out.println(doc.select("a#ctl08_gv_ctl05_linkSite").text());
        System.out.println(doc.select("span#ctl08_gv_ctl05_lab1").text());
        System.out.println(doc.select("span#ctl08_gv_ctl05_lab2").text());
        Elements elements = doc.select("table#ctl08_gv.TABLE_G").select("tr");
        System.out.println();
        System.out.println(elements.get(1));
        System.out.println();
        System.out.println(elements.get(1).select("td"));
        System.out.println();
        System.out.println(elements.get(1).select("td").get(0).text());
        System.out.println(elements.get(1).select("td").get(1).text());
        System.out.println(elements.get(1).select("td").get(2).text());
    }
}
