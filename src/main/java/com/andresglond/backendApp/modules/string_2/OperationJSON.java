package com.andresglond.backendApp.modules.string_2;

import java.io.Serializable;

public class OperationJSON implements Serializable {

    private String result;


    public void setResult(String word) {
        this.result = word;
    }

    public String getResult() {
        return result;
    }
}



