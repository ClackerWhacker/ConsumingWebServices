package com.example.consuming.domainclasses;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


// This means that any values in the string not found in this will duly be ignored
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quotes {

    // Variable name must be the same as the key in the JSON object
    private String type;
    private Value value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
