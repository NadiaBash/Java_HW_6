package ru.netology;

public class StatisticService {
    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int findAvg(int[] sales) {
        return sum(sales) / sales.length;
    }


    public int MinMonthSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int MaxMonthSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int MonthLessThanAvg(int[] sales) {
        int avg = findAvg(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < avg) {
                month++;
            }
        }
            return month;
        }


    public int MonthMoreThanAvg(int[] sales) {
        int avg = findAvg(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > avg) {
                month++;
            }
        }
            return month;
        }
    }
