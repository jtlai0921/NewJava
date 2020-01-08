package com.lab3;

public class SwitchCase_Demo1 {
    public static void main(String[] args) {
        String id = "A134678123";
        char sex = id.charAt(1);
        System.out.println("id= " + id);
        System.out.println("sex= " + sex);
        if(sex == '1'){
            System.out.println("男");
        } else if(sex == '2') {
            System.out.println("女");
        } else {
            System.out.println("性別錯誤");
        }
        System.out.println("--------------");
        switch(sex) { // byte, char, short, int, String, (int)long
            case '1':
                System.out.println("男");
                break;
            case '2':
                System.out.println("女");
                break;
            default:
                System.out.println("性別錯誤");
                //break;
        }
    }
}
