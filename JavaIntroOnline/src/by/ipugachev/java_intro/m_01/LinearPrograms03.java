package by.ipugachev.java_intro.m_01;

/*
 * Module 1. Basics of software code development
 * LinearPrograms
 * Task 3
 * Task condition:
 *   Вычислить значение по формуле (все переменные принимают действительные значения):
 *   (sin x + cos y) / (cos x - sin y) * tg xy
 */

public class LinearPrograms03 {
    public static void main(String[] args) {
        double x = 5;
        double y = 2;
        double z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println("z = " + z);
    }
}
