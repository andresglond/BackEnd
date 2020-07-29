package com.andresglond.backendApp.modules.arrays;

import java.io.Serializable;

public class StringArrayDTO implements Serializable {

    private String [] strings;

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }
}
