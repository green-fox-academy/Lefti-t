package com.api.frontend.models;

import java.util.List;

public class Result {
    private Object result;
    private List<Integer> results;

    public Result(Integer result) {
        this.result = result;
    }

    public Result() {
    }

    public Result(List<Integer> results) {
        this.results = results;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Integer until) {
        this.result = result;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }
}


