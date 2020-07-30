package com.backend.log.services.payload;

import java.util.ArrayList;
import java.util.List;

public class LogDtoResponse {

    private List<LogDtoEntryResponse> entries = new ArrayList<>();
    private Integer entry_count;

    public LogDtoResponse(List<LogDtoEntryResponse> entries, Integer entry_count) {
        this.entries = entries;
        this.entry_count = entry_count;
    }

    public List<LogDtoEntryResponse> getEntries() {
        return entries;
    }

    public void setEntries(List<LogDtoEntryResponse> entries) {
        this.entries = entries;
    }

    public Integer getEntry_count() {
        return entry_count;
    }

    public void setEntry_count(Integer entry_count) {
        this.entry_count = entry_count;
    }
}
