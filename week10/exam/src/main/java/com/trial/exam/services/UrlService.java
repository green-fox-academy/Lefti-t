package com.trial.exam.services;

import com.trial.exam.models.Url;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UrlService {



    void save(String url,String alias);

    Integer createSecretCode();

    Url getUrlByAlias(String alias);

    Url getUrlBySecretCode(Integer secretCode);

    List<Url> getUrls();
}
