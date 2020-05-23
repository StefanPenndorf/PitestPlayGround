package net.cyphoria.pitest.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Stefan Pennndorf
 */
class PassFilterTest {

    private PassFilter passFileterFive;

    @BeforeEach
    protected void setup() {
        passFileterFive = new PassFilter(5);
    }

    @Test
    public void test01() {
        boolean result = passFileterFive.filter(1);
        Assertions.assertTrue(result);
    }

    @Test
    public void test02() {
        boolean result = passFileterFive.filter(10);
        Assertions.assertFalse(result);
    }

    @Test
    public void test03() {
        boolean result = passFileterFive.filter(5);
        Assertions.assertFalse(result);
    }
}