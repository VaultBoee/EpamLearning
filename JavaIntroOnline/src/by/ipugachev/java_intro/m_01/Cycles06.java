package by.ipugachev.java_intro.m_01;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
 * Module 1. Basics of software code development
 * Cycles
 * Task 4
 * Task condition:
 *   Вывести на экран соответствия между символами и их численными обозначениями в памяти компьютера.
 */

public class Cycles06 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter how many characters you want to display ->");
        int a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print(i + "=" + (char) i + " ");
            if(i % 10 == 0) System.out.println();
        }
    }
}
