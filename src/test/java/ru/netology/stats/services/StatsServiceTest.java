package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumOfAllSalesTest() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.sumOfAllSales(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageMonthlySalesTest() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.averageMonthlySales(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthOfMaximumSalesTest() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.monthOfMaximumSales(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthOfMinimumSalesTest() {

        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.monthOfMinimumSales(arr);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthlySalesBelowAverageTest() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthlySalesBelowAverage(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthlySalesAboveAverageTest() {
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthlySalesAboveAverage(arr);
        Assertions.assertEquals(expected, actual);
    }
}