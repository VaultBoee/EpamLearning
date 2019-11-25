package by.ipugachev.java_intro.m_01;

/*
 * Module 1. Basics of software code development
 * Branches
 * Task 3
 * Task condition:
 *   Даны три точки A(x1, y1), B(x2, y2) и C(x3, y3).
 *   Определить, будут ли они расположены на одной прямой.
 */

public class Branches03 {
    public static void main(String[] args) {
        int x1 = 0;
        int y1 = 0;
        int x2 = -2;
        int y2 = -2;
        int x3 = +2;
        int y3 = +2;

        if ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1-y3) == 0){
            System.out.println("Points lie on one straight line.");
        }
        else {
            System.out.println("Points do not lie on one straight line.");
        }
    }
}
