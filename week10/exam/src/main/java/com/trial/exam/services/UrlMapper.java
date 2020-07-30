package com.trial.exam.services;

import com.trial.exam.models.Url;
import com.trial.exam.services.payload.UrlDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UrlMapper {

    public List<UrlDTO> mapUrlstoUrlDTOs(List<Url> urlList) {
        List<UrlDTO> urlDTOList = new ArrayList<>(urlList.size());
        for (Url url : urlList) {
            UrlDTO urlDTO = new UrlDTO();
            urlDTO.setId(url.getId());
            urlDTO.setUrl(url.getUrl());
            urlDTO.setAlias(url.getAlias());
            urlDTO.setHitCount(url.getHitCount());
            urlDTOList.add(urlDTO);
        }
        return urlDTOList;
    }
}
