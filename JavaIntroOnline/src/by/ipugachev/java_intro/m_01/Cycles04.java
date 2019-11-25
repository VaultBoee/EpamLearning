package by.ipugachev.java_intro.m_01;

import java.math.BigInteger;
/*
 * Module 1. Basics of software code development
 * Cycles
 * Task 4
 * Task condition:
 *   Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Cycles04 {
    public static void main(String[] args) {
        BigInteger result = new BigInteger("1");

        for (int i = 1; i <= 200; i++) {
            result = result.multiply(BigInteger.valueOf(i * i));
        }

        System.out.print("The product of the squares of the first two hundred numbers is " + result);
    }
}
