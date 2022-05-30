package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    public void shouldSum() {
        StatisticService statisticService = new StatisticService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = statisticService.findAvg(managerSales);

        assertEquals(expected, actual);

    }


    @Test
    public void shouldFindAvg() {
        StatisticService statisticService = new StatisticService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = statisticService.sum(managerSales);

        assertEquals(expected, actual);

    }


    @Test
    public void shouldReturnMinMonthSales() {
        StatisticService statisticService = new StatisticService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = statisticService.MinMonthSales(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMaxMonthSales() {
        StatisticService statisticService = new StatisticService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = statisticService.MaxMonthSales(managerSales);

        assertEquals(expected, actual);
    }


    @Test
    public void shouldReturnMonthLessThanAvg() {
        StatisticService statisticService = new StatisticService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = statisticService.MonthLessThanAvg(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMonthMoreThanAvg() {
        StatisticService statisticService = new StatisticService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = statisticService.MonthMoreThanAvg(managerSales);
        assertEquals(expected, actual);
    }
}

