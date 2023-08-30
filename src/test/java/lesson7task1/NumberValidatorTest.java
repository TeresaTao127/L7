package lesson7task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


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
}