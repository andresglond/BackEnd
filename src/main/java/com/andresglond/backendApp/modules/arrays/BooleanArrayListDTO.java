package com.andresglond.backendApp.modules.arrays;

import java.io.Serializable;
import java.util.ArrayList;

public class BooleanArrayListDTO implements Serializable {

    private ArrayList<Boolean> booleanArray;
    private int trueValue;
    private int falseValue;

    public ArrayList<Boolean> getBooleanArray() {
        return booleanArray;
    }

    public void setBooleanArray(ArrayList<Boolean> booleanArray) {
        this.booleanArray = booleanArray;
    }

    public int getTrueValue() {
        return trueValue;
    }

    public void setTrueValue(int trueValue) {
        this.trueValue = trueValue;
    }

    public int getFalseValue() {
        return falseValue;
    }

    public void setFalseValue(int falseValue) {
        this.falseValue = falseValue;
    }
}
