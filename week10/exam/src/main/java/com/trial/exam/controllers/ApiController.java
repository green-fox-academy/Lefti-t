package com.trial.exam.controllers;

import com.trial.exam.models.Url;
import com.trial.exam.services.UrlMapper;
import com.trial.exam.services.UrlService;
import com.trial.exam.services.payload.UrlDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {


    final
    UrlService urlService;
    final
    UrlMapper urlMapper;

    public ApiController(UrlService urlService, UrlMapper urlMapper) {
        this.urlService = urlService;
        this.urlMapper = urlMapper;
    }


    @GetMapping("/api/links")
    public List<UrlDTO> getData() {
        List<Url> entries = this.urlService.getUrls();
        List<UrlDTO> dataEntries = urlMapper.mapUrlstoUrlDTOs(entries);
        return dataEntries;
    }

    @DeleteMapping("/api/links/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id, @RequestBody Url url) {
        if (this.urlService.getUrlById(id) == null ) {
            return   new ResponseEntity<>("Error! Not found!", HttpStatus.NOT_FOUND);
        } else if ( !this.urlService.getUrlById(id).equals(url.getId())){
            return   new ResponseEntity<>("Error! Not found!", HttpStatus.NOT_FOUND);
        }
        else if (this.urlService.getUrlById(id) != null && !this.urlService.getUrlById(id).getSecretCode().equals(url.getSecretCode())) {
            return   new ResponseEntity<>("Error! Action is forbidden!", HttpStatus.FORBIDDEN);
        }
        else if (this.urlService.getUrlById(id) != null && this.urlService.getUrlById(id).getSecretCode().equals(url.getSecretCode())) {
            this.urlService.deleteById(id);
            return   new ResponseEntity<>("OK! Deletion was successful!", HttpStatus.NO_CONTENT);
        }
        return   new ResponseEntity<>("Error! Not found!", HttpStatus.NOT_FOUND);
    }
}
