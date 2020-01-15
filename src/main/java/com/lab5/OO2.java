package com.lab5;

class BMI {
    double height;
    double weight;
    double bmiValue;
    
    void setBmiValue() {
        bmiValue = weight / Math.pow(height/100, 2);
    }
}

public class OO2 {
    public static void main(String[] args) {
        BMI bmi = new BMI();
        bmi.height = 170.0;
        bmi.weight = 60.5;
        bmi.setBmiValue();
        System.out.printf("height: %.2f weight: %.2f bmi: %.2f\n", bmi.height, bmi.weight, bmi.bmiValue);
        
    }
}
