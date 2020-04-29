package kukulam.module.testing.level.B;

/*
    simple test (self implementation)
 */

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * TODO: write own implementation of {@link kukulam.module.testing.level.B.OwnCalculator}
 * Create class OwnCalculatorTest
 * Hint: all necessary examples are in {@link kukulam.module.testing.level.A.IntegerCalculatorTest}
 */
public class OwnCalculatorTest {

    @Test
    void shouldAddCorrectlyThreeInts() {
        // Given
        OwnCalculator ownCalculator = new OwnCalculator();

        // When
        int result = ownCalculator.add(2, 2,6);

        // Then
        assertThat(result).isEqualTo(10);

    }
}