package com.andresglond.backendApp.modules.arrays;

import java.io.Serializable;

public class BooleanDTO implements Serializable {

    private boolean value;

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}
