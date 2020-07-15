package com.andresglond.backendApp.modules.string_1;

public class ManageString1 {

    public String quantityCharacters(String string) {
        return "" + string.length();
    }

    public String convertToUppercase(String string) {

        return string.toUpperCase();
    }

    public String convertToLowercase(String string) {

        return string.toLowerCase();
    }

    public String replaceStringInText(String text, String word1, String word2) {
        
        return text.replaceAll(word1, word2);
    }
}
