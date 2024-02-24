package org.example.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticServiceTest {

    private static ArithmeticService arithmeticService;

    @BeforeAll
    public static void initArithmeticService() {
        arithmeticService = new ArithmeticService();
    }

    @Test
    void divide() {
        assertThrows(IllegalArgumentException.class, () -> arithmeticService.divide(0, 2));
    }

    @ParameterizedTest
    @NullSource
        //@NullAndEmptySource
    void testParameterizedTest1(String string) {
        assertNull(string);
    }

    @ParameterizedTest
    @EmptySource
        //@NullAndEmptySource
    void testParameterizedTest2(String string) {
        assertTrue(string.isBlank());
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "IVAN", "INOKENTIY"
    })
    void testParameterizedTest3(String string) {
        System.out.println(string);
        assertFalse(string.isBlank());
    }

    @ParameterizedTest
    @MethodSource("getStreamOfArguments")
    void testParameterizedTest4(String string, int i) {
        System.out.println("string - " + string);
        System.out.println("int - " + i);
        assertFalse(string.isBlank());
    }

    public static Stream<Arguments> getStreamOfArguments() {
        return Stream.of(
          Arguments.of("String 1", 1),
          Arguments.of("String 2", 2),
          Arguments.of("String 3", 3),
          Arguments.of("String 4", 4)
        );
    }



    @ParameterizedTest
    //@CsvFileSource(resources = "/testCsv.csv", delimiter = ',', numLinesToSkip = 1)
    @CsvSource({
            "1", "2", "1", "2"
    })
    void testParameterizedTest5(int i) {
        System.out.println("int - " + i);
        assertNotNull(i);
    }
}