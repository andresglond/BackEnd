package com.andresglond.backendApp.modules.string_2;

import java.io.Serializable;

public class DataDTO implements Serializable {

    private int spaces;
    private int enters;
    private int tabulations;
    private int commas;
    private int period;

    public int getSpaces() {
        return spaces;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }

    public int getEnters() {
        return enters;
    }

    public void setEnters(int enters) {
        this.enters = enters;
    }

    public int getTabulations() {
        return tabulations;
    }

    public void setTabulations(int tabulations) {
        this.tabulations = tabulations;
    }

    public int getCommas() {
        return commas;
    }

    public void setCommas(int commas) {
        this.commas = commas;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
