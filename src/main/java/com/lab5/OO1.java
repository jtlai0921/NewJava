package com.lab5;

import java.util.HashMap;

public class OO1 {
    public static void main(String[] args) {
        // 變數
        double height = 170;
        double weight = 60.5;
        double bmi = weight / Math.pow(height/100, 2);
        System.out.printf("height: %.2f weight: %.2f bmi: %.2f\n", height, weight, bmi);
        
        // 陣列
        double[] values = {170.0, 60.5, 0};
        values[2] = values[1] / Math.pow(values[0]/100, 2);
        System.out.printf("height: %.2f weight: %.2f bmi: %.2f\n", values[0], values[1], values[2]);
        
        // 容器集合
        HashMap<String, Double> map = new HashMap<>();
        map.put("height", 170.0);
        map.put("weight", 60.5);
        map.put("bmi", 0.0);
        double bmiValue = map.get("weight") / Math.pow(map.get("height")/100, 2);
        map.put("bmi", bmiValue);
        System.out.printf("height: %.2f weight: %.2f bmi: %.2f\n", map.get("height"), map.get("weight"), map.get("bmi"));
        
    }
}
