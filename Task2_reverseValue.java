package com.loops.homework.task2;

import java.util.Scanner;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 *
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class Task2_reverseValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value");
        int value = scanner.nextInt();
        System.out.println("The reverse value is: " + getReverseValue(value));
    }
    public static int getReverseValue (int value){
        int result = 0;
        while (value > 0){
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }
}
