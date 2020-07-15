package com.andresglond.backendApp.modules.string_1;

import java.io.Serializable;

public class ReplaceTextDTO implements Serializable {


    private String text;
    private String word1;
    private String word2;


    public void setText (String word) {
        this.text = word;
    }
    public String getText() {
        return text;
    }
    public void setWord1 (String word) {
        this.word1 = word;
    }
    public String getWord1() {
        return word1;
    }
    public void setWord2 (String word) {
        this.word2 = word;
    }
    public String getWord2() {
        return word2;
    }
}
