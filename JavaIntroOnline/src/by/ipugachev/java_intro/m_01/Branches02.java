package by.ipugachev.java_intro.m_01;

/*
 * Module 1. Basics of software code development
 * Branches
 * Task 2
 * Task condition:
 *   Найти max{min(a, b), min(c, d)}.
 */

public class Branches02 {
    public static void main(String[] args) {
        int a = 25;
        int b = 45;
        int c = 34;
        int d = 12;
        int min1;
        int min2;
        int maxTotal;

        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }
        if (c < d) {
            min2 = c;
        } else {
            min2 = d;
        }
        if (min1 > min2) {
            maxTotal = min1;
        } else {
            maxTotal = min2;
        }
        System.out.println("The maximum number of minimum numbers is " + maxTotal);
    }
}