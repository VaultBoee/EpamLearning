package by.ipugachev.java_intro.m_01;

import java.util.Scanner;

/*
 * Module 1. Basics of software code development
 * Cycles
 * Task 1
 * Task condition:
 *   Напишите программу, где пользователь вводит любое целое положительное число.
 *   А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class Cycles01 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int b = 0;
        System.out.print("Enter number ->");
        int a = scan.nextInt();

        if(a>=0) {
            for (int i = 1; i <= a; i++) {
                b += i;
            }
            System.out.println("Sum of numbers from 1 to " + a + " = " + b);
        }
        else System.out.println("Invalid numeric, enter positive int!");
    }
}