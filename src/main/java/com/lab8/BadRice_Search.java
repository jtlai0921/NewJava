package com.lab8;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class BadRice_Search {
    public static void main(String[] args) throws Exception {
        filter("冠軍");
    }
    
    public static void filter(String name) throws Exception {
        String jsonString = getJsonString();
        JsonElement je = JsonParser.parseString(jsonString);
        JsonArray ja = je.getAsJsonArray();
        int count = 0;
        for(int i=0;i<ja.size();i++) {
            JsonObject jo = ja.get(i).getAsJsonObject();
            if(jo.get("品名").getAsString().contains(name)) {
                System.out.println(jo);
                ++count;
            }
        }
        System.out.printf("查詢完成 , 總筆數: %d\n", count);
    }
    
    public static void test() throws Exception {
        String jsonString = getJsonString();
        //System.out.println(jsonString);
        // Json 資料分析 (使用 Gson)
        JsonElement je = JsonParser.parseString(jsonString);
        JsonArray ja = je.getAsJsonArray();
        System.out.println("筆數: " + ja.size());
        System.out.println(ja.get(0));
        System.out.println(ja.get(0).getAsJsonObject().get("品名").getAsString());
    }
    
    public static String getJsonString() throws Exception {
        String path = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        InputStream is = new URL(path).openStream();
        Scanner sc = new Scanner(is, "UTF-8").useDelimiter("\\A");
        return sc.next();
    }
}
