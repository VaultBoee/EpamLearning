package by.ipugachev.java_intro.m_01;

/*
 * Module 1. Basics of software code development
 * LinearPrograms
 * Task 2
 * Task condition:
 *   Вычислить значение по формуле (все переменные принимают действительные значения):
 *   (b + √(b^2 + 4ac)) / 2a - a^3c + b^(-2)
 */

public class LinearPrograms02 {
    public static void main(String[] args) {
        double a = 5;
        double b = 2;
        double c = 8;
        double z = ((b + Math.sqrt((b * b) + (4 * a * c))) / (2 * a)) - ((a * a * a) * c + (1 / (b * b)));
        System.out.println("z = " + z);
    }
}
