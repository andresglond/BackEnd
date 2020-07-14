package com.andresglond.backendApp.modules.String;

public class ManageString2 {

    String result;

    public ManageString2() {

    }

    public String convertToUpperOrLowerCaseByCharacter(String word) {

        Character[] arreglo = new Character[];
        String string;
        for(int i = 0; i < word.length(); i++) {
            arreglo[i] = word.charAt(i);
            if(Character.isLowerCase(arreglo[i]){
                   arreglo[i] = Character.toUpperCase(arreglo[i]);
            } else {
                arreglo[i] = Character.toLowerCase(arreglo[i]);
            }
           string = string + arreglo[i];
        }
        return string;
    }


    public String limitTextSize(String word) {

        Character[] arreglo = new Character[];
        String string;
        for(int i = 0; i < word.length(); i++) {
            arreglo[i] = word.charAt(i);
            if(Character.isLowerCase(arreglo[i]){
                arreglo[i] = Character.toUpperCase(arreglo[i]);
            } else {
                arreglo[i] = Character.toLowerCase(arreglo[i]);
            }
            string = string + arreglo[i];
        }
        return string;
    }
    
}
