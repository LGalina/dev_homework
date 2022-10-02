package com.arrays.homework;

import java.util.Arrays;

/**
 * Задание 1
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 */
public class Task1RemoveNegativeValue {
    public static void main(String[] args) {
        int[] values = {3, 5, -6, 3, 2, -9, 0, -123};
        System.out.println(Arrays.toString(removeNegativeValue(values, countPositivevalue(values))));
    }

    public static int[] removeNegativeValue(int[] values, int count) {
        int[] resultaArray = new int[count];
        int index = 0;
        for (int value : values) {
            if (value >= 0) {
                resultaArray[index] = value * count;
                index++;
            }
        }
        return resultaArray;
    }

    public static int countPositivevalue(int[] value) {
        int count = 0;
        for (int j : value) {
            if (j >= 0) {
                count++;
            }
        }
        return count;
    }
}
