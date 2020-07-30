package com.trial.exam.controllers;

import com.trial.exam.models.Url;
import com.trial.exam.services.UrlMapper;
import com.trial.exam.services.UrlService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller
public class UrlController {

    final
    UrlService urlService;
    final
    UrlMapper urlMapper;

    public UrlController(UrlService urlService, UrlMapper urlMapper) {
        this.urlService = urlService;
        this.urlMapper = urlMapper;
    }

    @GetMapping("/")
    public String main() {
        return "main";
    }

    @PostMapping("/save-link")
    public String saveUrl(Model model,@RequestParam String newUrl, @RequestParam String newAlias) {
        if (urlService.getUrlByAlias(newAlias) != null) {
            model.addAttribute("aliasExist", "true");
        } else {
            this.urlService.save(newUrl, newAlias);
            model.addAttribute("aliasExist", "false");
            model.addAttribute("secretCode", urlService.getUrlByAlias(newAlias).getSecretCode());
            model.addAttribute("alias", urlService.getUrlByAlias(newAlias).getAlias());
        }
        return "main";
    }

    @GetMapping("/a/{alias}")
    public String getByAlias(@PathVariable String alias, HttpServletResponse httpServletResponse) {
        if (urlService.getUrlByAlias(alias) != null) {
            this.urlService.increaseHitCount(alias);
            httpServletResponse.setStatus(HttpServletResponse.SC_OK);
            return "redirect:https://" + urlService.getUrlByAlias(alias).getUrl();
        } else {
            httpServletResponse.setStatus(HttpServletResponse.SC_NOT_FOUND);
            throw new ResourceNotFound404();
        }
    }


}
