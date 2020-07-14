package com.andresglond.backendApp.modules.string_1;

public class ManageString1 {

    private String result;
    private String text;
    private String word1;
    private String word2;


    public ManageString1() {

    }
    public ManageString1(String text) {
        this.result = text;
    }

    public void setResult (String word) {
        this.result = word;
    }
    public String getResult() {
        return result;
    }
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

    public String quantityCharacters(String string) {
        return result = "" + string.length();
    }

    public String convertToUppercase(String string) {

        return result = string.toUpperCase();
    }

    public String convertToLowercase(String string) {

        return result = string.toLowerCase();
    }

    public String replaceStringInText(String text, String word1, String word2) {
        
        return result = text.replaceAll(word1, word2);
    }
}
