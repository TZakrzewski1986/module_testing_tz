package kukulam.module.testing.level.E;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/*
    tdd
 */
class NumberCalculatorTest {

    /**
     * TODO: implement and write test in TDD manner for {@link NumberCalculator}
     */

    private NumberCalculator numberCalculator;

    @BeforeEach
    void beforeEach() {
        numberCalculator = new NumberCalculator();
        System.out.println("New object has been created");
    }

    @AfterEach
    void afterEach() {
        numberCalculator = null;
        System.out.println("Object has been deleted!");
    }

    @Test
    void shouldReturnAverageFromGivenArray() {
        // Given
        int[] givenNumbers = {10, 20, 30};

        // When
        double result = numberCalculator.average(givenNumbers);

        // Then
        assertThat(result).isEqualTo(20);
    }

    @Test
    void shouldReturnSumFromGivenArray(){
        // Given
        int[] givenNumbers = {10, 20, 30};

        // When
        int result = numberCalculator.sum(givenNumbers);

        // Then
        assertThat(result).isEqualTo(60);
    }
}