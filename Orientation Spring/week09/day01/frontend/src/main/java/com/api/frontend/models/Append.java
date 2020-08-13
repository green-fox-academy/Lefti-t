package com.api.frontend.models;

public class Append {
    private String appended;

    public Append(String appended) {
        this.appended = appended + "a";
    }

    public Append() {
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
