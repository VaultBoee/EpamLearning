package by.ipugachev.java_intro.m_01;

/*
 * Module 1. Basics of software code development
 * Cycles
 * Task 4
 * Task condition:
 *   Для каждого натурального числа в промежутке от m до n вывести все делители,
 *   кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

public class Cycles07 {
    public static void main(String[] args) {
        int m = 4;
        int n = 12;

        for (int i = m; i <= n; i++) {
            System.out.print("Divisors for number " + i + " except 1 and " + i + " : ");
            for(int j = 2; j < n-1; j++){
                if(i % j == 0){
                    if (i == j) break;
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

    }
}