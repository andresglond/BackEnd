package com.andresglond.backendApp.modules.arrays;

import java.io.Serializable;
import java.util.ArrayList;

public class ArrayListDTO implements Serializable {

    private ArrayList<Integer> numArray;
    private int sumArray;

    public ArrayList<Integer> getNumArray() {
        return numArray;
    }

    public void setNumArray(ArrayList<Integer> numArray) {
        this.numArray = numArray;
    }

    public int getSumArray() {
        return sumArray;
    }

    public void setSumArray(int sumArray) {
        this.sumArray = sumArray;
    }
}
