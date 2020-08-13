package com.trial.exam.services.payload;

import com.trial.exam.models.Url;

import java.util.ArrayList;
import java.util.List;

public class UrlDTO {

private List<Url> urls = new ArrayList<>();
    private Long id;
    private String url;
    private String alias;
    private Integer hitCount;

    public UrlDTO(Long id, String url, String alias, Integer hitCount) {
        this.id = id;
        this.url = url;
        this.alias = alias;
        this.hitCount = hitCount;
    }

    public UrlDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getHitCount() {
        return hitCount;
    }

    public void setHitCount(Integer hitCount) {
        this.hitCount = hitCount;
    }
}
