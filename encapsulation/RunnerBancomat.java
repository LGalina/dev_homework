package com.oop.encapsulation;

public class RunnerBancomat {
    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat(5, 2, 4);
        bancomat.addMoney(1,0,0);
        System.out.println("\n The operation was performed: " + bancomat.withdrawMoney(88));

    }
}
