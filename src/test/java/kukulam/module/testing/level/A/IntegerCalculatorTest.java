package kukulam.module.testing.level.A;

import org.assertj.core.api.AbstractIntegerAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/*
    simple tests, isEqualTo, parametrized test
 */
public class IntegerCalculatorTest {

    /**
     * Example test with usage of {@link Assertions#assertThat}.
     */
    @Test
    void shouldAddTwoIntegersCorrectly() {
        // given
        int a = 10;
        int b = 5;
        int expectedResult = 15;

        IntegerCalculator calculator = new IntegerCalculator();

        // when
        int result = calculator.add(a, b);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    /**
     * TODO: test a - b, write test for {@link IntegerCalculator#subtract(int, int)}
     * In section 'then', please use assertions:
     * {@link Assertions#assertThat(int)}
     * {@link AbstractIntegerAssert#isEqualTo(int)}
     */
    @Test
    void shouldSubtractTwoIntegersCorrectly() {
        // given
        int a = 10;
        int b = 5;

        IntegerCalculator calculator = new IntegerCalculator();

        // when
        int result = calculator.subtract(a, b);

        // then
        assertThat(result).isEqualTo(5);

    }

    /**
     * TODO: test a * b, write test for {@link IntegerCalculator#multiply(int, int)}
     * In section 'given' prepare two integers and instance of class {@link IntegerCalculator}.
     * In section 'when' use {@link IntegerCalculator#multiply(int, int)} to get result of multiplication.
     * In section 'then', please use assertions:
     * {@link Assertions#assertThat(int)}
     * {@link AbstractIntegerAssert#isEqualTo(int)}
     * Hint: look at {@link #shouldSubtractTwoIntegersCorrectly}
     */
    @Test
    void shouldMultiplyTwoIntegersCorrectly() {
        // given
        int a = 2;
        int b = 5;

        IntegerCalculator integerCalculator = new IntegerCalculator();

        // when
        int result = integerCalculator.multiply(a, b);

        // then
        assertThat(result).isEqualTo(10);
    }

    /**
     * TODO EXTRA: test a * a, write test for {@link IntegerCalculator#power(int)}
     * In section 'then', please use assertions:
     * {@link Assertions#assertThat(int)}
     * {@link AbstractIntegerAssert#isEqualTo(int)}
     */
    @Test
    void shouldCalculateSquareNumber() {
        // given
        int a = 4;

        IntegerCalculator integerCalculator = new IntegerCalculator();

        // when
        int result = integerCalculator.power(a);

        // then
        assertThat(result).isEqualTo(16);

    }

    /**
     * Example of parametrized test.
     */
    @ParameterizedTest
    @MethodSource("addTwoIntegersArguments")
    void shouldAddTwoIntegersCorrectlyParameterizedTest(int a, int b, int expectedResult) {
        // given
        IntegerCalculator calculator = new IntegerCalculator();

        // when
        int result = calculator.add(a, b);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    static Stream<Arguments> addTwoIntegersArguments() {
        return Stream.of(
                //        a,   b,   expectedResult
                arguments(10,  5,   15),
                arguments(1,   2,    3),
                arguments(3,   6,    9)
        );
    }

    /**
     * TODO EXTRA: parametrized test a - b, write test for {@link IntegerCalculator#subtract(int, int)}
     * 1. Remove annotation @Disabled
     * 2. Create static method with the name 'subtractTwoIntegersArguments' and with return type Stream<Arguments>.
     * You can copy it from method {@link IntegerCalculatorTest#addTwoIntegersArguments()},
     * but REMEMBER to rename method and change value of arguments.
     * 3. Write test, like in {@link #shouldAddTwoIntegersCorrectlyParameterizedTest}.
     */
    @ParameterizedTest()
    @MethodSource("subtractTwoIntegersArguments")
    void shouldSubtractTwoIntegersCorrectlyParameterizedTest(int a, int b, int expectedResult) {
        // given
        IntegerCalculator integerCalculator = new IntegerCalculator();

        // when
        int result = integerCalculator.subtract(a, b);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    static Stream<Arguments> subtractTwoIntegersArguments() {
        return Stream.of(
                arguments(10, 5, 5),
                arguments(20, 10, 10),
                arguments(8, 4, 4)
        );
    }

}