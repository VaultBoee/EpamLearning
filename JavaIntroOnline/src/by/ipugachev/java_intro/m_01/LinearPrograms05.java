package by.ipugachev.java_intro.m_01;

/*
 * Module 1. Basics of software code development
 * LinearPrograms
 * Task 5
 * Task condition:
 *   Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
 *   Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 *   HHч MMмин SSс.
 */

public class LinearPrograms05 {
    public static void main(String[] args) {
        int givenSeconds = 1435094;
        int hours = givenSeconds / 3600;
        int minutes = (givenSeconds - hours * 3600) / 60;
        int seconds = (givenSeconds - hours * 3600 - minutes * 60);
        System.out.println("HH" + hours + " MM" + minutes  + " SS" + seconds);
    }
}
