package com.lab5_3;

public class BMIImpl implements BMI {
    private double height;
    private double weight;
    private double bmiValue;
    
    public BMIImpl(double h, double w) {
        height = h;
        weight = w;
        bmiValue = weight / Math.pow(h/100, 2);
    }
    
    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getBmiValue() {
        return bmiValue;
    }
    
}
