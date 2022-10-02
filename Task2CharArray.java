package com.arrays.homework;//package com.arrays.homework;

/**
 * Задание 2
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 *
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы,
 * которые больше этого среднего арифметического.
*/

public class Task2CharArray {
    public static void main(String[] args) {
        char[] simbol = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int[] values = new int[simbol.length];
        values = convertInArrayOfNumbers(simbol);

        printMaxValue(values,findAverageValue(values));
    }

   public static int[] convertInArrayOfNumbers(char[] simbol){
            int[] values = new int[simbol.length];
           for (int i = 0; i < simbol.length; i++) {
               values[i] = simbol[i];
           }
           return values;
        }
    public static double findAverageValue(int[] values){
        double result = 0;
        for (int i = 0; i < values.length; i++) {
            result += values[i];
        }
        return  (result / values.length);
    }

    public static void printMaxValue(int[] values, double average){
        for (int i = 0; i < values.length; i++) {
            if (values[i] > average){
                System.out.print(values[i] + " ");
            }
        }
    }
}
