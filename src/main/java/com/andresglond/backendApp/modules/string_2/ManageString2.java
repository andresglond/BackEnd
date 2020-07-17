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

            if (aux2 == 80) {
                string = string + aux + "\n";
                aux2 = 0;
            } else {
                string = string + aux;
                aux2 = aux2 + 1;
            }

        }
        return string;
    }
    public DataDTO countData(String text) {

        char aux;
        int spaces;
        int enters;
        int tabulations;
        int commas;
        int period;
        DataDTO dataDTO = new DataDTO();
        spaces = text.length() - text.replaceAll(" ","").length();
        enters = text.length() - text.replaceAll("\n","").length();
        tabulations = text.length() - text.replaceAll("\t","").length();
        commas = text.length() - text.replaceAll(",","").length();
        period = text.length() - text.replaceAll("\\.","").length();
        System.out.println(text.replaceAll(".","").length());
        dataDTO.setSpaces(spaces);
        dataDTO.setEnters(enters);
        dataDTO.setTabulations(tabulations);
        dataDTO.setCommas(commas);
        dataDTO.setPeriod(period);


        return dataDTO;
    }




}
