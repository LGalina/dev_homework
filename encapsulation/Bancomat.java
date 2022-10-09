package com.oop.encapsulation;

/**
 * Задание 1
 * Создать класс, описывающий банкомат.
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 20, 50 и 100.
 * Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */

public class Bancomat {
    public static final int B20_VALUE = 20;
    public static final int B50_VALUE = 50;
    public static final int B100_VALUE = 100;
    private int b20;
    private int b50;
    private int b100;

    public Bancomat() {
    }

    public Bancomat(int b20, int b50, int b100) {
        this.b20 = b20;
        this.b50 = b50;
        this.b100 = b100;
    }

    public int getB20() {
        return b20;
    }

    public void setB20(int b20) {
        this.b20 = b20;
    }

    public int getB50() {
        return b50;
    }

    public void setB50(int b50) {
        this.b50 = b50;
    }

    public int getB100() {
        return b100;
    }

    public void setB100(int b100) {
        this.b100 = b100;
    }

    public void addMoney(int b20, int b50, int b100) {
        this.b20 += b20;
        this.b50 += b50;
        this.b100 += b100;
    }

    private int currentBallance() {
        return this.b20 * B20_VALUE + this.b50 * B50_VALUE + this.b100 * B100_VALUE;
    }

    public boolean withdrawMoney(int withd) {
        boolean flag = false;
        int bal = currentBallance();
        if (withd <= bal && withd >= 0) {
            bal -= withd;
            extractMoney(withd);
            flag = true;
        } else {
            System.out.println("error: there is not enough money in the ATM, withdraw an amount less than: " + bal);
        }
        return flag;
    }
    private void extractMoney(int withd) {
        while (withd > 0) {
            while ((withd == B100_VALUE) || (withd - B100_VALUE >= B50_VALUE) || (withd - B100_VALUE > B100_VALUE)) {

                System.out.println((withd / B100_VALUE) + " x " + B100_VALUE);
                withd -= (withd / B100_VALUE) * B100_VALUE;
            }
            while ((withd == B50_VALUE) || (withd - B50_VALUE >= B20_VALUE) || (withd - B50_VALUE > B50_VALUE)) {
                System.out.println((withd / B50_VALUE) + " x " + B50_VALUE);
                withd -= (withd / B50_VALUE) * B50_VALUE;

            }
            while (withd - B20_VALUE >= 0) {

                if ((withd == B20_VALUE) || (withd - B20_VALUE < B20_VALUE)) {
                    System.out.println((withd / B20_VALUE) + " x " + B20_VALUE);
                    withd = withd - ((withd / B20_VALUE) * B20_VALUE);
                }
            }
            if (withd < B20_VALUE - 1 && withd > 0) {
                System.out.println("the extracted value is lower, they are missing " + withd + " because we don't have banknotes with a value of less than 20 in the ATM");
                break;
            }
        }
    }
}

