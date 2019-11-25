package by.ipugachev.java_intro.m_01;

/*
 * Module 1. Basics of software code development
 * Циклы
 * Задача 8
 * Условие:
 *   Даны два числа. Определить цифры, входящие в запись как первого, так и второго числа.
 */

public class Cycles08 {
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 4567890;

        intNums(num1);
        intNums(num2);
    }
    public static int intCount (int num){
        int count = (num == 0) ? 1 : 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    public static void intNums (int num){
        int counter = intCount(num);
        int temp = num;
        int a = 100;
        int b = 10;
        System.out.print("Число " + temp + " состоит из :");
        if(counter == 1){
            System.out.print(temp);
        }
        else {
            System.out.print(temp % 10 + " ");
            for (int i = 1; i < counter; i++) {
                System.out.print(temp % a / b + " ");
                a = a * 10;
                b = b * 10;
            }
        }
        System.out.println();
    }
}