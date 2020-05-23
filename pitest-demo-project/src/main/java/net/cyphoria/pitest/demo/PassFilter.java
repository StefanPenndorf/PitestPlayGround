package net.cyphoria.pitest.demo;

/**
 * @author Stefan Pennndorf
 */
public class PassFilter {

    private int  limit;

    public PassFilter(int limit) {
        this.limit=limit;
    }

    public boolean filter(int i) {
        return i < limit;
    }

}
