package com.lab5_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BMI bmi1 = new BMIImpl(170.0, 60.5);
        BMI bmi2 = new BMIImpl(155.0, 42.5);
        BMI bmi3 = new BMIImpl(180.0, 76.5);
        BMI bmi4 = new BMI() {
            public double getHeight() {
                return 170.0;
            }
            public double getWeight() {
                return 60.0;
            }
            public double getBmiValue() {
                return 60 / Math.pow(170.0/100, 2);
            }
        };
        System.out.print("bmi4: ");
        print(bmi4);
        
        BMI[] bmis = {bmi1, bmi2, bmi3};
        for (BMI bmi : bmis){
            print(bmi);
        }
        // 18~23
        System.out.println("18 ~ 23:");
        for (BMI bmi : bmis){
            if(bmi.getBmiValue() >= 18 && bmi.getBmiValue() <= 23) {
                print(bmi);
            }
        }
        // Java 8
        // 18~23
        System.out.println("18 ~ 23:");
        Arrays.asList(bmis)
                .stream()
                .filter(bmi -> bmi.getBmiValue() >= 18 && bmi.getBmiValue() <= 23)
                .forEach(bmi -> print(bmi));
        
    }
    
    public static void print(BMI bmi) {
        System.out.printf("height: %.2f weight: %.2f bmi: %.2f\n", bmi.getHeight(), bmi.getWeight(), bmi.getBmiValue());
    }
}
