package lesson7task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static lesson7task1.DigitSumCalculator.calculateDigitSum;
import static org.junit.jupiter.api.Assertions.*;

class DigitSumCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "432, 9",
            "12345, 15",
            "0, 0",
            "1, 1"
    })
    public void testDigitSumCalculation(int number, int expectedSum) {
        int calculatedSum = DigitSumCalculator.calculateDigitSum(number);
        Assertions.assertEquals(expectedSum, calculatedSum);
    }

}