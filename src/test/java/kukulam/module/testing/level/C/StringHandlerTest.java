package kukulam.module.testing.level.C;

import org.assertj.core.api.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

/*
    arrays, assertions, BeforeEach, BeforeAll, AfterEach, AfterAll
 */
class StringHandlerTest {

    private StringHandler stringHandler;

    @BeforeEach
    void beforeEach() {
        stringHandler = new StringHandler();
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Start running tests from class " + StringHandlerTest.class.getName());
    }

    @AfterEach
    void afterEach() {
        stringHandler = null;
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Stop running tests from class " + StringHandlerTest.class.getName());
    }

    /**
     * Example of assertions. Usage of:
     * {@link Assertions#assertThat(int)}
     * {@link IterableAssert#isNull()}
     * {@link IterableAssert#containsExactly(Object[])}
     */
    @Test
    void shouldMergeTwoArraysWithCorrectOrder() {
        // given
        String[] women = new String[] { "Betty", "Caroline" };
        String[] men = new String[] { "James", "Henry" };
        String[] expectedResult = new String[] { "Betty", "Caroline", "James", "Henry" };

        // when
        String[] result = stringHandler.add(women, men);

        // then
        assertThat(result).isNotNull();
        assertThat(result.length).isEqualTo(4);
        assertThat(result).containsExactly(expectedResult);
    }

    /**
     * TODO: write test for method {@link StringHandler#create(String...)} when parameters are not provided
     * 1. Rename test1 to be more descriptive.
     * 2. Test method {@link StringHandler#create(String...)} without parameters.
     * 3. In section 'then', please use assertions:
     * {@link Assertions#assertThat(String)}
     * {@link AbstractCharSequenceAssert#isNull()}
     * Hint: look at {@link #shouldMergeTwoArraysWithCorrectOrder}
     */
    @Test
    void shouldReturnNull() {
        // given
        String[] isNullExample = new String[]{};

        // when
        String result = stringHandler.create(isNullExample);

        // then
        assertThat(result).isNull();
    }

    /**
     * TODO: write test for method {@link StringHandler#create(String...)} when parameters are provided
     * 1. Rename test2 to be more descriptive.
     * 2. Test method {@link StringHandler#create(String...)} with at least 3 parameters.
     * 3. In section 'then', please use assertions:
     * {@link Assertions#assertThat(String)}
     * {@link AbstractCharSequenceAssert#isNotNull()}
     * {@link AbstractCharSequenceAssert#isEqualTo(Object)}
     * Hint: look at {@link #shouldMergeTwoArraysWithCorrectOrder}
     */
    @Test
    void shouldCreateStringFromGivenObject() {
        // given
        String[] cars = new String[] {"Opel", "Fiat", "Yamaha", "Suzuki"};
        String expectedResult = "OpelFiatYamahaSuzuki";

        // when
        String result = stringHandler.create(cars);

        // then
        assertThat(result).isNotNull();
        assertThat(result).isEqualTo(expectedResult);

    }

    /**
     * TODO: write test for method {@link StringHandler#add(String[], String[])}
     * 1. Rename test3 to be more descriptive.
     * 2. Test method {@link StringHandler#add(String[], String[])} with two arrays containing strings.
     * 3. In section 'then', please use assertions:
     * {@link Assertions#assertThat(int)}
     * {@link IterableAssert#isNotNull()}
     * {@link IterableAssert#containsExactly(Object[])}
     * Hint: look at {@link #shouldMergeTwoArraysWithCorrectOrder}
     */
    @Test
    void test3() {
        // given

        // when

        // then
    }

    /**
     * TODO EXTRA: write all possible tests for {@link StringHandler#convert(String, boolean)}}
     */
}