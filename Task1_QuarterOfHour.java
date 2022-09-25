package com.function.homework.task1;

import java.util.Scanner;

/**
 * Задание 1
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * Протестировать функцию в main.
 */
public class Task1_QuarterOfHour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input minutes: ");
        byte minutes = scanner.nextByte();
        getQuarterOfHour(minutes);
    }

    public static void getQuarterOfHour(byte minutes) {
        if (minutes >= 0 && minutes <= 15) System.out.println("The value is in the 1st quarter of an hour");
            else if (minutes > 15 && minutes <= 30) System.out.println("The value is in the 2nd  quarter of an hour");
                else if (minutes > 30 && minutes <= 45)  System.out.println("The value is in the 3rd quarter of an hour");
                    else System.out.println("The value is in the 4th quarter of an hour");
    }
}
