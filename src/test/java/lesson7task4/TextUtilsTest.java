package lesson7task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.stream.Stream;

import static lesson7task4.TextUtils.calculateLength;

class TextUtilsTest {

    @ParameterizedTest
    @MethodSource("text")
    void shouldReturnCalculateLength(String text, int expectedLength) {
        int calculateLength = text.length();
        Assertions.assertEquals(expectedLength, calculateLength);
    }

    private static Stream<Arguments> text() {
        return Stream.of(
                Arguments.of("BeforeAll", 9),
                Arguments.of("BeforeEach", 10),
                Arguments.of("AfterEach", 9),
                Arguments.of("AfterAll", 8)
        );
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnNull(String text) {
        int result = TextUtils.calculateLength(null);
        Assertions.assertEquals(0, result);
    }
}