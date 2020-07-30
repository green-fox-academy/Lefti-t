package com.backend.log.services.payload;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LogDTO {


    private String endpoint;
    private String data;

    public LogDTO() {
    }


    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
