package net.cyphoria.pitest.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author Stefan Pennndorf
 */
class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void canAddTwoInts() {
        final int sum = calculator.add(1, 2);
        assertThat(sum, is(3));
    }

    @Test
    public void canReallyAddTwoInts() {
        final int sum = calculator.add(42, 1);
        assertThat(sum, is(43));
    }

    @Test
    public void doesntLikeNegativFirstArgument() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.add(-1, 2)
        );

    }

}