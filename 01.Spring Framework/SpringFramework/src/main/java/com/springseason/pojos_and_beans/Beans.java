package com.springseason.pojos_and_beans;

import java.io.Serializable;

class JavaBean implements Serializable //C3
 {

    //Constraint 1: Public no-arg constructor
    public JavaBean() {

    }

    private String type;
    private int value;

    // C2 -> getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
