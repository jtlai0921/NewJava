package com.lab5_2_2;

class BMI {
    private double height;
    private double weight;
    private double bmiValue;
    
    // 建構子
    public BMI() {
    
    }
    
    // 建構子
    public BMI(double h, double w) {
        setHeight(h);
        setWeight(w);
        setBmiValue();
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double h) {
        if(h >= 50 && h <= 300) {
            height = h;
        }
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double w) {
        if(w >= 20 && w <= 500) {
            weight = w;
        }
    }
    
    public double getBmiValue() {
        return bmiValue;
    }
    
    void setBmiValue() {
        if (weight >= 20 && height >= 50) {
            bmiValue = weight / Math.pow(height/100, 2);
        }
    }
}
public class OO1 {
    public static void main(String[] args) {
        BMI bmi = new BMI(170, 60.5);
        System.out.printf("height: %.2f weight: %.2f bmi: %.2f\n", bmi.getHeight(), bmi.getWeight(), bmi.getBmiValue());
        
        BMI bmi2 = new BMI();
        bmi2.setHeight(180.0);
        bmi2.setWeight(75.5);
        bmi2.setBmiValue();
        System.out.printf("height: %.2f weight: %.2f bmi: %.2f\n", bmi2.getHeight(), bmi2.getWeight(), bmi2.getBmiValue());
        
    }
}
