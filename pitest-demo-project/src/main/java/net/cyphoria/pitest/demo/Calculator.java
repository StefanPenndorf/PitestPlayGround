package net.cyphoria.pitest.demo;

/**
 * @author Stefan Pennndorf
 */
public class Calculator {
    public int add(final int a, final int b) {
        if (a < 0) {
            throw new IllegalArgumentException("I don't like negative numbers!");
        }
        return a+b;
    }
}
