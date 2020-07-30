package com.trial.exam.services;

import com.trial.exam.models.Url;
import com.trial.exam.repositories.UrlRepository;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UrlServiceImpl implements UrlService  {

    final
    UrlRepository urlRepository;

    public UrlServiceImpl(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    @Override
    public void save(String url,String alias) {
        Url newUrl = new Url();
        this.urlRepository.save (new Url(url,alias,createSecretCode()));
    }

    @Override
    public Integer createSecretCode() {
        Random r = new Random();
        String output = "";
        for (int i = 0 ; i < 4 ; i++){
            output+=r.nextInt(10);
        }
        int outputInt = Integer.parseInt(output);
        return outputInt;
    }

    @Override
    public Url getUrlByAlias(String alias) {

        return this.urlRepository.findUrlByAlias(alias);
    }

    @Override
    public Url getUrlBySecretCode(Integer secretCode) {
        return this.urlRepository.findUrlBySecretCode(secretCode);
    }
}
