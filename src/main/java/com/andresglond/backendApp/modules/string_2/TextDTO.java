package com.andresglond.backendApp.modules.string_2;

import java.io.Serializable;

public class TextDTO implements Serializable {

    private String text;


    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}




