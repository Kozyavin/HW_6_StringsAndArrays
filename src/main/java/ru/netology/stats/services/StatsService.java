package ru.netology.stats.services;

import java.util.Arrays;

public class StatsService {
    public int sumOfAllSales(int[] arr) {   //сумма всех продаж
        int sum = 0;
      /*  for(int i=0; i< arr.length; i++)
            sum= sum +arr[i];
        return sum;*/
        for (int s : arr)
            sum = sum + s;
        return sum;
    }

    public int averageMonthlySales(int[] arr) {   //средняя сумма продаж за все месяцы

       /* int sum = 0;
          for(int i=0; i< arr.length; i++)
            sum = sum +arr[i];
            int avg = sum/arr.length;
        return avg;*/
        int avg = sumOfAllSales(arr) / arr.length;
        return avg;

    }

    public int monthOfMaximumSales(int[] arr) {   //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
        int maxMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[maxMonth])
                maxMonth = i;
        }
        return maxMonth + 1;
    }

    public int monthOfMinimumSales(int[] arr) {  //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
        int minMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[minMonth])
                minMonth = i;
        }
        return minMonth + 1;
    }

    public int monthlySalesBelowAverage(int[] arr) {  //количество месяцев, в которых продажи были ниже среднего
        int mba = 0;
        int avg = averageMonthlySales(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) //сравниваем с средним значением продаж за 12 месяцев
                mba = mba + 1;
        }
        return mba;
    }

    public int monthlySalesAboveAverage(int[] arr) { //количество месяцев, в которых продажи были выше среднего
        int mba = 0;
        int avg = averageMonthlySales(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) //сравниваем с средним значением продаж за 12 месяцев
                mba = mba + 1;
        }
        return mba;
    }
}
