package com.andresglond.backendApp.modules.arrays;

import java.io.Serializable;

public class IntegerArrayDTO implements Serializable {

    private int[] integers;

    public int[] getIntegers() {
        return integers;
    }

    public void setIntegers(int[] integers) {
        this.integers = integers;
    }
}
