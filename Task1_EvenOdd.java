package com.loops.homework.task1;

import java.util.Scanner;

/**
 * Задание 1
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр
 * (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class Task1_EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value: ");
        int value = scanner.nextInt();
        System.out.println(value + " are " + countOfEvenDigit(value) + " even digit" + " and " + countOfOddDigit(value) + " odd digit");
    }

    public static int countOfEvenDigit(int value) {
        int count = 0;
        while (value > 0) {
            if ((value % 10) % 2 == 0) {
                count++;
            }
            value /= 10;
        }
        return count;
    }

    public static int countOfOddDigit(int value) {
        int count = 0;
        while (value > 0) {
            if ((value % 10) % 2 != 0) {
                count++;
            }
            value /= 10;
        }
        return count;
    }
}
