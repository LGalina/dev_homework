package com.arrays.homework;

/**
 * Задание 3
 * Дан одномерный массив целых чисел.
 *
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 */
public class Task3TransformArray {
    public static void main(String[] args) {
        int[] intitArr = {-4, 0, 1, 9, 0, -18, 3};
        print(splitArrayPositive(intitArr));
    }

    private static void print(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            int[] ints = values[i];
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] splitArrayPositive(int[] values) {
        int countp = 0;
        int countn = 0;
        int countz = 0;
        for (int j = 0; j < values.length; j++) {
            if (values[j] > 0) {
                countp++;
            } else if (values[j] < 0) {
                countn++;
            } else {
                countz++;
            }
        }
        int[] arrP = new int[countp];
        int[] arrN = new int[countn];
        int[] arrZ = new int[countz];

        int[][] arr = {arrP, arrN, arrZ};
        for (int i = 0, p = 0, n = 0 , z = 0; i < values.length; i++) {
            if (values[i] > 0) {
                arrP[p] = values[i];
                p++;
            } else if (values[i] < 0) {
                arrN[n] = values[i];
                n++;
            } else if (values[i] == 0) {
                arrZ[z] = values[i];
                z++;
            }
        }
        return arr;
    }
}
