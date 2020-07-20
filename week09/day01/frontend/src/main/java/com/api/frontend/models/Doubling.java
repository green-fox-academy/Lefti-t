package com.api.frontend.models;

import java.util.HashMap;
import java.util.Map;

public class Doubling {
    protected Integer input;

    public Doubling(Integer number) {
        this.input = number;
    }

    public Integer getInput() {
        return input;
    }

    public void setInput(Integer number) {
        this.input = number;
    }


    public Map<String,Object> doubleInput() {
        Map<String, Object> doubled = new HashMap<>();
            doubled.put("received", input);
            input = input * 2;
            doubled.put("result", new Doubling(input).getInput());
        return doubled;
    }
}
