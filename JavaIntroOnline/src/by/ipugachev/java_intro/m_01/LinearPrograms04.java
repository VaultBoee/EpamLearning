package by.ipugachev.java_intro.m_01;

/*
 * Module 1. Basics of software code development
 * LinearPrograms
 * Task 4
 * Task condition:
 *   Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 *   Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class LinearPrograms04 {
    public static void main(String[] args) {
        double r = 314.231;
        System.out.println("Condition: " + r);
        int n = (int) r;
        int d = (int) Math.round((r - n) * 1000);
        double result = d + (double) n / 1000;
        System.out.println("Result: " + result);
    }
}
