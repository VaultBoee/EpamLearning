package by.ipugachev.java_intro.m_01;

/*
 * Module 1. Basics of software code development
 * Branches
 * Task 5
 * Task condition:
 *   Вычислить значение функции:
 *           x^2 - 3x + 9, если x <= 3;
 *   F(x) =
 *           1 / (x^3 + 6), если x > 3.
 */


public class Branches05 {
    public static void main(String[] args) {
        int x = 2;
        int F;

        if (x > 3) {
            F = 1 / ((x * x * x) + 6);
        } else {
            F = (x * x) - (3 * x) + 9;
        }
        System.out.println("F(" + x + ") = " + F);
    }
}
