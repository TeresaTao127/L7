package L7task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static L7task1.NumberValidator.DigitSumCalculator.calculateDigitSum;
import static org.junit.jupiter.api.Assertions.*;

class NumberValidatorTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void shouldReturnTrueForEvenNumber(int numberToCheck) {
        Assertions.assertTrue(NumberValidator.isNumberEven(numberToCheck));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 5, 7, 9, 11})
    void shouldReturnFalseForOddNumber(int numberToCheck) {
        Assertions.assertFalse(NumberValidator.isNumberEven(numberToCheck));
    }

    @ParameterizedTest
    @CsvSource({
            "432, 9",
            "12345, 15",
            "0, 0",
            "1, 1"
    })
    public void testDigitSumCalculation(int number, int expectedSum) {
        int calculatedSum = calculateDigitSum(number);
        Assertions.assertEquals(expectedSum, calculatedSum);
    }

}