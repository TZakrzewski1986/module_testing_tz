package kukulam.module.testing.level.E;

public class NumberCalculator {

    /**
     * Calculate average of all numbers from table.
     */
    double average(int[] numbers) {
        int sum = 0;
        for (int element : numbers) {
            sum += numbers[element];
        }
        int averageResult = sum / numbers.length;
        return averageResult;
    }

    ;

    /**
     * Sum all number from the table.
     */
    int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) {
            sum += numbers[i];
            return sum;
        }
        return sum;
    }
}
