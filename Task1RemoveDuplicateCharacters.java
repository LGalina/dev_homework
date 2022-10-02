package com.strings;

/**
 * Задание 1
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 *
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class Task1RemoveDuplicateCharacters {
    public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder("abc Cpddd Dio OsfWw");
        System.out.println(stringBuilder);
        char c = ' ';
        System.out.println(deleteDuplicate(toUpperCase(deleteSpace(stringBuilder, c))));
    }

    public static StringBuilder deleteDuplicate(StringBuilder stringBuilder){
        char previous = stringBuilder.charAt(0);
        StringBuilder result = new StringBuilder();
        result.append(stringBuilder.charAt(0));
        for (int i = 1; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) != previous) {
                result.append(stringBuilder.charAt(i));
                previous = stringBuilder.charAt(i);
            }
        }
        return result;
    }
    public static StringBuilder toUpperCase(StringBuilder stringBuilder) {
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (Character.isLowerCase(stringBuilder.charAt(i))) {
                stringBuilder.setCharAt(i, Character.toUpperCase(stringBuilder.charAt(i)));
            }
        }
        return stringBuilder;
    }
    public static StringBuilder deleteSpace(StringBuilder stringBuilder, char c){
        for (int i = 0; i <stringBuilder.length(); i++) {
            if(stringBuilder.charAt(i) == c)
                stringBuilder.deleteCharAt(stringBuilder.indexOf(" "));
        }
        return stringBuilder;
    }
}
