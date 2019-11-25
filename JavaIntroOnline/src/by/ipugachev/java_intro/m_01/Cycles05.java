package by.ipugachev.java_intro.m_01;

/*
 * Module 1. Basics of software code development
 * Cycles
 * Task 4
 * Task condition:
 *   Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых больше или равен заданному e.
 *   Общий член ряда имеет вид:
 *   a(n) = 1 / 2^n + 1 / 3^n
 */

public class Cycles05 {
    public static void main(String[] args) {
        int n = 52;
        double a;
        double e = 0.2;
        double sum = 0;

        for (int i = 1; i <= n; i++) {
        a = ((double) 1 / Math.pow(2, i)) + (1/ Math.pow(3, i));
        if (Math.abs(a) >= e){
            sum += a;
        }
        }
        System.out.println("Result is " + sum);
    }
}