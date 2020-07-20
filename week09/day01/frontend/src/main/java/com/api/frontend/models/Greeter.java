package com.api.frontend.models;

import java.util.HashMap;
import java.util.Map;

public class Greeter {

    private String name;
    private String title;

    public Greeter(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public Greeter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
