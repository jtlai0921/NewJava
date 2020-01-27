package com.lab6;

public class TestCalc {
    public static void main(String[] args) {
        Calc calc = new Calc() {
            public int opt(int x, int y) {
                return x + y;
            }
        };
        System.out.println(calc.opt(10, 20));
        
        Calc calc2 = (int x, int y) -> {return x + y;};
        System.out.println(calc2.opt(10, 20));
        
        Calc calc3 = (x, y) -> x + y;
        System.out.println(calc3.opt(10, 20));
    }
}
