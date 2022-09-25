package com.loops.homework.task3;

/**
 * Задание 3
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */
public class Task3SalaryJunior {
    private static final double INVEST_PER_MONTH = 0.1;
    private static final double INVEST_BENEFIT_PER_MONTH = 0.02;

    public static void main(String[] args) {
        int year = 3;
        int month = 2;
        double salary = 600;
        double raise = 400;
        int salaryChangeMonth = 6;
        double entertainment = 300;
        funds(salary, year, month, salaryChangeMonth, raise, entertainment);
    }

    public static void funds(double salary, int year, int month, int salaryChangeMonth, double raise, double entertainment) {
        int period = getPeriod(year, month);
        double result = salary;
        double accountBalance = 0;
        double investitions = 0;

        for (int i = 0; i <= period; i++) {
            if (i % (salaryChangeMonth + 1) == 0) result += raise;
            accountBalance += (result - transferToBroker(result) - getEntertaiment(entertainment));
            investitions += calcInvestition(transferToBroker(result));

            System.out.println("accountBalance on month " + i + " : " + accountBalance);
            System.out.println(" investitions on month " + i + " : " + investitions);
        }
    }

    public static int getPeriod(int year, int month) {
        return year * 12 + month;
    }

    public static double getEntertaiment(double entertainment) {
        return entertainment;
    }

    public static double transferToBroker(double salary) {
        return salary * INVEST_PER_MONTH;
    }

    public static double calcInvestition(double value) {
        return (value + value * INVEST_BENEFIT_PER_MONTH);
    }
}
