package com.lab3;

public class SwitchCase_Demo3 {
    public static void main(String[] args) {
        final char value = 'A';
        char a = 'A';
        switch(a) {
            case value: // 65
                System.out.println("得到 A");
                break;
            case 'B': // 66
                System.out.println("得到 B");
                break;
        }
    }
}
