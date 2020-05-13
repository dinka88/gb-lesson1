package com.company;

public class Main {
    public static void main(String[] args) {
        // Задание 2
        byte a = 1;
        short b = 2;
        int c = 3;
        long e = 4L;
        float g = 5.2f;
        double s = 6.5;
        char r = 'a';
        boolean t = true;
        String h = "Hello";

        // Задание 3
        float f = term(5f,8f,4f,2f);
        System.out.println ("Произведение будет равно " + f );

        // Задание 4
        boolean d = sumNumbers(22,12);
        System.out.println(d);

        // Задание 5
        whatNumber(99);

        // Задание 6
        boolean a = negativeNumber(-5);
        System.out.println(a);

        //Задание 7
        nameHello("Петя");

        // Задание 8
        year(400);
    }

    public static float term(float a, float b, float c, float d) {
        float f = a * (b + (c / d));
        return f;
    }

    public static boolean sumNumbers(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20){
            return true;
        } else {
            return false;
        }
    }

    public static void whatNumber(int a) {
        if (a >= 0){
            System.out.println("Число " + a +" положительное");
        }else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    public static boolean negativeNumber(int a) {
        return a < 0;
    }

    public static void nameHello(String a) {
        System.out.println(" Добро пожаловать " + a);
    }

    public static void year(int a) {
        if (a % 4 != 0) {
            System.out.println("Год "+ a + " обычный");
        } else {
            if (a % 100 != 0) {
                System.out.println("Год "+ a + " високосный");
            } else {
                if(a % 400 == 0) {
                    System.out.println("Год "+ a + " високосный");
                } else {
                    System.out.println("Год "+ a + " обычный");
                }
            }
        }
    }
}