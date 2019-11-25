package by.ipugachev.java_intro.m_01;

import java.util.Scanner;

/*
 * Module 1. Basics of software code development
 * Cycles
 * Task 2
 * Task condition:
 *   Вычислить значение функции на отрезке [a, b] с шагом h:
 *       x, x > 2
 *   y =
 *       -x, x <= 2
 */

class Cycles02 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the beginning of line a ->");
        double a = scan.nextDouble();

        System.out.print("Enter the beginning of line b ->");
        double b = scan.nextDouble();

        System.out.print("Enter step h ->");
        double h = scan.nextDouble();

       double max = Math.max(a,b);
       double min = Math.min(a,b);
       double y;

       if (h>0){
           while(min <= max) {
               if (min>2) y = min;
               else y = -min;
               System.out.println("Y = " + y);
               min += h;
           }
        }
    }
}