package com.andresglond.backendApp.modules.string_2;

public class ManageString2 {

    public String convertToUpperOrLowerCaseByCharacter(String text) {

        char aux;
        String string="";
        for(int i = 0; i < text.length(); i++) {
            aux = text.charAt(i);
            if(Character.isLowerCase(aux)){
                aux = Character.toUpperCase(aux);
            } else {
                aux = Character.toLowerCase(aux);
            }
            string = string + aux;
        }
        return string;
    }


    public String limitTextSize(String text) {

        char aux;
        String string="";
        int aux2 = 0;
        for (int i = 0; i < text.length(); i++) {
            aux = text.charAt(i);

            if (aux == 80) {
                string = string + "\n";
                aux2 = 0;
            } else {
                string = string + aux;
                aux2 = aux2 + 1;
            }

        }
        return string;
    }


}
