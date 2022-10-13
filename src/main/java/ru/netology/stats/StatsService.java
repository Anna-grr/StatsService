package ru.netology.stats;

public class StatsService {

    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int average(int[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth;
    }

    public int minSales(int[] sales) {
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

    public int lessThanAverageSales(int[] sales) {
        int average = average(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count = count + 1;
            }
        }
        return count;
    }

    public int moreThanAverageSales(int[] sales) {
        int average = average(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count = count + 1;
            }
        }
        return count;
    }
}



