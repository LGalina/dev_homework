package com.function.homework.task2;

import java.util.Scanner;

/**
 * Задание 2
 * Даны 3 переменные:
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */
public class Task2_charOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first operand:");
        double operand1 = scanner.nextDouble();
        System.out.println("Input second operand:");
        double operand2 = scanner.nextDouble();
        System.out.println("Input operation: ");
        char operation = scanner.next().charAt(0);
        if (operation != '+' && operation != '-' && operation != '*' && operation != '/' && operation != '%')
            System.out.println( "Unknown operation");
        else
            System.out.println("Result is: " + gerResult(operand1, operand2, operation) + " " + "(" + operand1 + " " + operation + " " + operand2 + ")");
    }
    public static double gerResult(double operand1, double operand2, char operation){
        return switch (operation) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> operand1 / operand2;
            case '%' -> operand1 % operand2;
            default -> 0;
        };
    }
}
