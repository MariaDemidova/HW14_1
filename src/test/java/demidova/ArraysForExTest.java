package demidova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ArraysForExTest {
    @ParameterizedTest
    @MethodSource("newArrAfter4Test")
    void newArrAfter4(int[] resultArray, int[] testArray) {
        Assertions.assertArrayEquals(resultArray, ArraysForEx.newArrAfter4(testArray));
    }

    private static Stream<Arguments> newArrAfter4Test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, new int[]{1, 3, 4, 4, 1, 2}),
                Arguments.of(new int[]{3, 5, 6}, new int[]{4, 3, 5, 6}),
                Arguments.of(new int[]{6}, new int[]{6, 3, 1, 4, 6}),
                Arguments.of(new int[]{}, new int[]{1, 7, 8, 4})
        );
    }

    @Test
    void newArrAfter4RunTimeException() {
        Assertions.assertThrows(RuntimeException.class, () -> ArraysForEx.newArrAfter4(new int[]{6, 3, 2, 6, 6, 2, 2, 6, 6}));
    }

    @ParameterizedTest
    @MethodSource("paramsFoundOneOr4")
    void FoundOneOr4(boolean result, int[] inputArray) {
        Assertions.assertEquals(result, ArraysForEx.foundOneOr4(inputArray));
    }

    private static Stream<Arguments> paramsFoundOneOr4() {
        return Stream.of(
                Arguments.of(true, new int[]{1, 1, 4, 4}),
                Arguments.of(true, new int[]{1, 1, 4, 1}),
                Arguments.of(true, new int[]{4, 4, 4, 4, 1}),
                Arguments.of(false, new int[]{4, 4, 4, 4}),
                Arguments.of(false, new int[]{1, 1, 1, 1}),
                Arguments.of(false, new int[]{3, 5, 2, 1, 1, 4})
        );
    }
}
