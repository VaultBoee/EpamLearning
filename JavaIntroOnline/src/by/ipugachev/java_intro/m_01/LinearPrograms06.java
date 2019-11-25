package by.ipugachev.java_intro.m_01;

/*
 * Module 1. Basics of software code development
 * LinearPrograms
 * Task 6
 * Task condition:
 *   Для данной области составить линейную программу, которая печатает true,
 *   если точка с координатами (x, y) принадлежит закрашенной области,
 *   и false - в противном случае.
 */

public class LinearPrograms06 {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;

        if ((x >= -4 && x <= 4 && y <= -3 && y <= 0)||(x >= -2 && x <= 2 && y >= -3 && y <= 4)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
