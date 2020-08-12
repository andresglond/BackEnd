package com.andresglond.backendApp.modules.arrays;
import java.io.Serializable;

public class StringDTO implements Serializable {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
