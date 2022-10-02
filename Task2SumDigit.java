package com.strings;

/**
 * Задание 2
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class Task2SumDigit {
    public static void main(String[] args) {
        String str = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        System.out.println(calculateSum(arrayOfDigit(str)));

    }

    public static int[] arrayOfDigit(String str){
        int[] arr = new int[str.length()];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if ( Character.isDigit(str.charAt(i))){
                arr[index] = Integer.parseInt(String.valueOf(str.charAt(i)));
                index++;
            }
        }
        return arr;
    }

    public static int calculateSum(int[] array){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
         return result;
    }
}
