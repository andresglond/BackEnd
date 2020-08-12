package com.andresglond.backendApp.modules.arrays;

import java.io.Serializable;

public class CharArrayDTO implements Serializable {

    private char[] array;

    public char[] getArray() {
        return array;
    }

    public void setArray(char[] array) {
        this.array = array;
    }
}
