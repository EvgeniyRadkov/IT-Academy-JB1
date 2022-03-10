package com.company;


public class Main {
    public static void main(String[] args) {
//        Math task1 = new Math();
//        task1.result();
//        Phrase text1 = new Phrase();
//        text1.text();
//        int num1 = 2;
//        int num2 = 5;
//        int num3 = 8;
//        int arithmetic = getArithmetic(num1, num2);
//        printArithmetic();
        int x = 3;
        int y = 4;
        int a = x*y+x+y;
        System.out.println(a);
    }

    static int getArithmetic(int num1, int num2, int num3){
       int arithmetic = num1 + num2 + num3;
       return arithmetic;
    }
    static void printArithmetic(){
        System.out.println(printArithmetic());
    }
}


