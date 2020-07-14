package com.andresglond.backendApp.modules.string;

public class ManageString1 {

    private String result;

    public ManageString1() {

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
