package L7task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static L7task4.TextLength.calculateLength;
import static org.junit.jupiter.api.Assertions.*;

class TextLengthTest {

    @ParameterizedTest
    @MethodSource("text")
    void testCalculateLength(String text, int expectedLength) {
        int calculateLength = calculateLength(text);
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
}