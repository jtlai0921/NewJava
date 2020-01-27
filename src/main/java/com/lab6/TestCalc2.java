package com.lab6;

public class TestCalc2 {
    public static void main(String[] args) {
        calcPrint((x, y) -> x - y);
        calcPrint((x, y) -> x + y);
        
        Calc mul = (x, y) -> x * y;
        Calc div = (x, y) -> x / y;
        calcPrint(mul);
        calcPrint(div);
    }
    
    public static void calcPrint(Calc calc) {
        System.out.println(calc.opt(100, 20));
    }
}
