package com.andresglond.backendApp.modules.string_1;

import java.io.Serializable;

public class TextDTO implements Serializable {

    private String text;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
