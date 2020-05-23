package net.cyphoria.pitest.maventestng;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Stefan Pennndorf
 */
class PassFilterTest {

    private PassFilter passFileterFive;

    @BeforeMethod
    protected void setup() {
        passFileterFive = new PassFilter(5);
    }

    @Test
    public void test01() {
        boolean result = passFileterFive.filter(1);
        Assert.assertTrue(result);
    }

    @Test
    public void test02() {
        boolean result = passFileterFive.filter(10);
        Assert.assertFalse(result);
    }

    @Test
    public void test03() {
        boolean result = passFileterFive.filter(5);
        Assert.assertFalse(result);
    }
}