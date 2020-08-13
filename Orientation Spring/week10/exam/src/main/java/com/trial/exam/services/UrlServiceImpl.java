package com.trial.exam.services;

import com.trial.exam.models.Url;
import com.trial.exam.repositories.UrlRepository;
import org.springframework.stereotype.Service;

import java.util.List;
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

    @Override
    public List<Url> getUrls() {
        List<Url> urls = this.urlRepository.findAll();
        return urls;
    }

    @Override
    public Url getUrlById(Long id) {
        return this.urlRepository.getOne(id);
    }

    @Override
    public void deleteById(Long id) {
         this.urlRepository.deleteById(id);
    }

    @Override
    public void increaseHitCount(String alias) {
        Url url = this.urlRepository.findUrlByAlias(alias);
        url.setHitCount(url.getHitCount() + 1);
        this.urlRepository.save(url);
    }
}
