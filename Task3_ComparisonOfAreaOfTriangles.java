package com.function.homework.task3;

import java.util.Scanner;

/**
 * Задание 3
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */
public class Task3_ComparisonOfAreaOfTriangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the 1st side of the 1st triangle");
        int firstSide1 = scanner.nextInt();
        System.out.println("Input the 2nd side of the 1st triangle");
        int secondSide1 = scanner.nextInt();
        System.out.println("The area of the 1st triangle is:" + getAria(firstSide1, secondSide1));

        System.out.println("Input the 1st side of the 2nd triangle");
        int firstSide2 = scanner.nextInt();
        System.out.println("Input the 2nd side of the 2nd triangle");
        int secondSide2 = scanner.nextInt();
        System.out.println("The area of the 2nd triangle is: " + getAria(firstSide2, secondSide2));

        compareArias(firstSide1, secondSide1, firstSide2, secondSide2);
    }

    public static double getAria(int firstSide, int secondSide) {
        return firstSide * secondSide / 2.0;
    }

    public static void compareArias(int firstSide1, int secondSide1, int firstSide2, int secondSide2) {
        if (getAria(firstSide1, secondSide1) > getAria(firstSide2, secondSide2))
            System.out.println("The area of the first triangle is bigger than the second triangle");
        else if (getAria(firstSide1, secondSide2) < getAria(firstSide2, secondSide2))
            System.out.println("The area of the first triangle is smaller than the second triangle");
        else System.out.println("The area of the first triangle is equal than the second triangle");
    }
}
