package com.trial.exam.controllers;

import com.trial.exam.models.Url;
import com.trial.exam.services.UrlMapper;
import com.trial.exam.services.UrlService;
import com.trial.exam.services.payload.UrlDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
