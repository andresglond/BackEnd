package com.andresglond.backendApp.modules.String;

public class ManageString2 {

    private String result;

    public ManageString2() {

    }
    public ManageString2(String word) {
        this.result = word;
    }

    public void setResult(String word) {
        this.result = word;
    }

    public String getResult() {
        return result;
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


    public String limitTextSize(String text) {

        Character[] arreglo = new Character[];
        String string;
        int aux = 0;
        for (int i = 0; i < text.length(); i++) {
            arreglo[i] = text.charAt(i);

            if (aux == 80) {
                string = string + "\n";
                aux = 0;
            } else {
                string = string + arreglo[i];
                aux = aux + 1;
            }

        }
        return string;
    }

    //public String[][]
}
