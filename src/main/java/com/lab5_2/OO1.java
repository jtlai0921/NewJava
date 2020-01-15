package com.lab5_2;

class BMI {
    private double height;
    private double weight;
    private double bmiValue;
    
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
        BMI bmi = new BMI();
        bmi.setHeight(-170.0);
        bmi.setWeight(-60.5);
        bmi.setBmiValue();
        System.out.printf("height: %.2f weight: %.2f bmi: %.2f\n", bmi.getHeight(), bmi.getWeight(), bmi.getBmiValue());
    }
}
