package kukulam.module.testing.level.D.car;

import kukulam.module.testing.level.D.person.PersonRepositoryTest;
import kukulam.module.testing.level.D.person.PeopleAgeAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.assertj.core.api.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/*
    advanced tests
 */
class CarRepositoryTest {

    private CarRepository carRepository;

    @BeforeEach
    void beforeEach() {
        carRepository = new CarRepository();
        System.out.println("New object created!");
    }

    @AfterEach
    void cleanUpEach() {
        carRepository = null;
        System.out.println("After Each cleanUpEach() method called");
    }

    /**
     * TODO: write test for methods {@link CarRepository#findAll()}, {@link CarRepository#add(Car)}
     * 1. Initialize/clean {@link CarRepository} with annotations: {@link BeforeEach}, {@link AfterEach}.
     * 2. Add couple cars with method {@link CarRepository#add(Car)} in section when
     * 3. Find cars with method {@link CarRepository#findAll()}
     * 4. In section 'then', please use assertions:
     * {@link Assertions#assertThat(int)}
     * {@link AbstractIntegerAssert#isEqualTo(int)}
     * {@link IterableAssert#containsExactly(Object[])}
     * Hint: look at {@link PersonRepositoryTest#shouldFindAllAddedPeople()}
     * Remember about annotation {@link Test} before test method
     */
    @Test
    public void shouldFindAllAddedCars() {
        // Given
        Car opelCorsa = new Car("Opel Corsa", 12);
        Car alfaRomeo = new Car("Alfa Romeo", 10);
        Car bmwX1 = new Car("Bmw X1", 3);

        // When
        carRepository.add(opelCorsa);
        carRepository.add(alfaRomeo);
        carRepository.add(bmwX1);

        // and
        Car[] foundCars = carRepository.findAll();

        // Then
        assertThat(foundCars.length).isEqualTo(3);
        assertThat(foundCars).containsExactly(opelCorsa, alfaRomeo, bmwX1);

    }

    /**
     * TODO: write test for methods {@link CarRepository#findByAge(int)} ()}
     * 1. Initialize/clean {@link CarRepository} with annotations: {@link BeforeEach}, {@link AfterEach}.
     * 2. Add couple cars with method {@link CarRepository#add(Car)} in section given
     * 3. Find cars with method {@link CarRepository#findByAge(int)}
     * 4. In section 'then', please use assertions:
     * {@link Assertions#assertThat(int)}
     * {@link AbstractIntegerAssert#isEqualTo(int)}
     * {@link IterableAssert#containsExactly(Object[])}
     * Hint: look at {@link PersonRepositoryTest#shouldFindPeopleByAge()}
     * Remember about annotation {@link Test} before test method
     */
    @Test
    void shouldFindCarsByAge() {
        // Given
        Car opelCorsa = new Car("Opel Corsa", 12);
        Car alfaRomeo = new Car("Alfa Romeo", 10);
        Car bmwX1 = new Car("Bmw X1", 3);

        int age = 10;

        // When
        carRepository.add(opelCorsa);
        carRepository.add(alfaRomeo);
        carRepository.add(bmwX1);

        // and
        Car[] cars = carRepository.findByAge(age);

        // Then
        assertThat(cars.length).isEqualTo(1);
        assertThat(cars).containsExactly(alfaRomeo);

    }

    /**
     * TODO: write the same test for methods {@link CarRepository#findByAge(int)} ()} but use your own assertion
     * 1. Initialize/clean {@link CarRepository} with annotations: {@link BeforeEach}, {@link AfterEach}.
     * 2. Add couple cars with method {@link CarRepository#add(Car)} in section given
     * 3. Find cars with method {@link CarRepository#findByAge(int)}
     * 4. In section 'then', please use your assertion
     * Hint: look at
     * {@link PersonRepositoryTest#shouldFindPeopleByAgeWithOwnAssertion()}
     * {@link PeopleAgeAssert#hasAge(int)}
     * Remember about annotation {@link Test} before test method
     */
    @Test
    void shouldFindCarsByAgeWithOwnAssertion() {
        // Given
        Car opelCorsa = new Car("Opel Corsa", 12);
        Car alfaRomeo = new Car("Alfa Romeo", 10);
        Car bmwX1 = new Car("Bmw X1", 3);

        int age = 10;

        // When
        carRepository.add(opelCorsa);
        carRepository.add(alfaRomeo);
        carRepository.add(bmwX1);

        // and
        Car[] cars = carRepository.findByAge(age);

        // Then
        CarAgeAssert.assertThat(cars).hasAge(10);

    }

    /**
     * TODO EXTRA: write test for method {@link CarRepository#findByName(String)}
     */

    @Test
    void shouldFindCarsByName() {
        // Given
        Car opelCorsa = new Car("Opel Corsa", 12);
        Car alfaRomeo = new Car("Alfa Romeo", 10);
        Car bmwX1 = new Car("Bmw X1", 3);

        String carsName = "Opel Corsa";

        // When
        carRepository.add(opelCorsa);
        carRepository.add(alfaRomeo);
        carRepository.add(bmwX1);

        // and
        Car[] cars = carRepository.findByName(carsName);

        // Then
        assertThat(cars).containsExactly(opelCorsa);
        assertThat(cars.length).isEqualTo(1);
    }
}