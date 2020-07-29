package com.andresglond.backendApp.modules.arrays;

import java.io.Serializable;


public class IntegerDTO implements Serializable {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
