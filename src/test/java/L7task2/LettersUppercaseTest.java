package L7task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static L7task2.LettersUppercase.lettersConvertUppercase;
import static org.junit.jupiter.api.Assertions.*;

class LettersUppercaseTest {

    @ParameterizedTest
    @ValueSource(strings = {"int", "string", "double"})
    void shouldReturnUppercase(String text) {
        String result = lettersConvertUppercase(text);
        Assertions.assertEquals(text.toUpperCase(), result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testConvertToUpperCaseWithNullAndEmpty(String text) {
        String result = lettersConvertUppercase(null);
        Assertions.assertEquals("The text is null", result);
    }

}
