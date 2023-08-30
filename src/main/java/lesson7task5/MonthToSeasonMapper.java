package lesson7task5;

import java.time.Month;

public class MonthToSeasonMapper {

    public static Season mapMonthToSeason(Month month) {
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return Season.WINTER;
            case MARCH:
            case APRIL:
            case MAY:
                return Season.SPRING;
            case JUNE:
            case JULY:
            case AUGUST:
                return Season.SUMMER;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Season.AUTUMN;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
    }
}
