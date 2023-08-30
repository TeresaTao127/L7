package lesson7task5;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.Month;


class MonthToSeasonMapperTest {

    @ParameterizedTest
    @EnumSource(Month.class)
    public void shouldReturnMapMonthToSeason(Month month) {

        Season mappedSeason = MonthToSeasonMapper.mapMonthToSeason(month);

        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                Assertions.assertEquals(Season.WINTER, mappedSeason);
                break;
            case MARCH:
            case APRIL:
            case MAY:
                Assertions.assertEquals(Season.SPRING, mappedSeason);
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                Assertions.assertEquals(Season.SUMMER, mappedSeason);
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                Assertions.assertEquals(Season.AUTUMN, mappedSeason);
                break;
        }
    }

}