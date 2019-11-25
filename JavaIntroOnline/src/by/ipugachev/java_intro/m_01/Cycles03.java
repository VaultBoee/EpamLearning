package by.ipugachev.java_intro.m_01;

/*
 * Module 1. Basics of software code development
 * Cycles
 * Task 1
 * Task condition:
 *   Найти сумму квадратов первых ста чисел.
 */

public class Cycles03 {
    public static void main(String[] args){
        int sum = 0;

        for(int i = 1; i<=100;i++){
            sum += i * i;
        }

        System.out.println("The sum of the squares of the first hundred numbers is = " + sum);
    }
}