package com.andresglond.backendApp.modules.arrays;

import java.util.ArrayList;

public class Array {

    ArrayList<String> texts = new ArrayList<String>();
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    ArrayList<Boolean> booleans = new ArrayList<Boolean>();
    int trueV = 0, falseV = 0;

    public CharArrayDTO getHelloWorld() {
        char[] array = {'H','e','l','l','o',' ','W','o','r','l','d'};
        CharArrayDTO arreglo = new CharArrayDTO();
        arreglo.setArray(array);
        return arreglo;
    }

    public CharArrayDTO getArrayFromString(String text){
        char[] array = new char[text.length()];
        CharArrayDTO arreglo = new CharArrayDTO();
        for(int i = 0; i<text.length();i++){
            array[i] = text.charAt(i);
        }
        arreglo.setArray(array);
        return  arreglo;
    }

    public ArrayList <String> getArrayOfStrings(String text) {
        texts.add(text);
        return texts;
    }

    public ArrayListDTO getSumOfIntegers(int integer){
        ArrayListDTO arrayListDTO = new ArrayListDTO();
        int sum = 0;

        numbers.add(integer);
        arrayListDTO.setNumArray(numbers);
        for(int i = 0; i<numbers.size();i++){

            sum = sum + numbers.get(i);
        }
        arrayListDTO.setSumArray(sum);

        return arrayListDTO;
    }

    public BooleanArrayListDTO getDataBoolean(boolean value) {
        BooleanArrayListDTO booleanValue = new BooleanArrayListDTO();
        booleans.add(value);
        booleanValue.setBooleanArray(booleans);
        if(value){
            trueV += 1;
        }else {
            falseV +=1;
        }
        booleanValue.setTrueValue(trueV);
        booleanValue.setFalseValue(falseV);

        return booleanValue;
    }

    public String getStringUnited(String[] array){
        String text="";
        for(int i = 0;i<array.length;i++){
            if(i==0){
                text = "" + array[i];
            }
            else {
                text = text + " " + array[i];
            }
        }
        return text;
    }

    public int getResultado(int[] array){
        int value = 0;
        for(int i = 0; i< array.length;i++){
            if(i > 0){
                if(i % 2 != 0){
                    value = value + array[i];
                }else {
                    value = value - array[i];
                }
            }else {
                value = array[i];
            }
        }
        return value;
    }


}
