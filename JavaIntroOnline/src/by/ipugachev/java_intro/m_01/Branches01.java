package by.ipugachev.java_intro.m_01;

/*
 * Module 1. Basics of software code development
 * Branches
 * Task 1
 * Task condition:
 *   Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 *   и если да, то будет ли он прямоугольным.
 */

public class Branches01 {
    public static void main(String[] args) {
        int a = 45;
        int b = 45;

        if (a + b < 180) {
            System.out.print("Triangle exists");
            if (a == 90 || b == 90 || (a + b == 90)) {
                System.out.println(" and it is rectangular");
            }
        } else {
            System.out.println("Triangle does not exist!");
        }
    }
}
