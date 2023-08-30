package lesson7task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;


class LettersUppercaseConverterTest {

    @ParameterizedTest
    @ValueSource(strings = {"int", "string", "double"})
    void shouldReturnUppercase(String text) {
        String result = LettersUppercaseConverter.ConvertToUppercase(text);
        Assertions.assertEquals(text.toUpperCase(), result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnConvertToUpperCaseWithNullAndEmpty(String text) {
        String result = LettersUppercaseConverter.ConvertToUppercase(null);
        Assertions.assertEquals("The text is null", result);
    }

}
