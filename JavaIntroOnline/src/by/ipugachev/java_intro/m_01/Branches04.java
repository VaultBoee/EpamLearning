package by.ipugachev.java_intro.m_01;

/*
 * Module 1. Basics of software code development
 * Branches
 * Task 4
 * Task condition:
 *   Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.
 *   Определить, пройдет ли кирпич через отверстие.
 */

public class Branches04 {
    public static void main(String[] args) {
        int A = 5;
        int B = 10;
        int x = 10;
        int y = 6;
        int z = 5;

        if (x <= A && y <= B || y <= A && x <= B ||
                x <= A && z <= B || z <= A && x <= B ||
                z <= A && y <= B || y <= A && z <= B){
            System.out.println("The brick will pass");
        }
        else
            System.out.println("The brick will not pass");
    }
}
