package com.trial.exam.controllers;

import com.trial.exam.models.Url;
import com.trial.exam.services.UrlService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UrlController {

    final
    UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @GetMapping("/")
    public String main() {
        return "main";
    }

    @PostMapping("/save-link")
    public String saveUrl(Model model, @ModelAttribute("url") Url url, @RequestParam String newUrl, @RequestParam String newAlias) {
        if (urlService.getUrlByAlias(newAlias) != null) {
           model.addAttribute("aliasExist","true");
        } else {
            this.urlService.save(newUrl, newAlias);
            model.addAttribute("aliasExist","false");
            model.addAttribute("secretCode", urlService.getUrlByAlias(newAlias).getSecretCode());
            model.addAttribute("alias", urlService.getUrlByAlias(newAlias).getAlias());
        }
        return "main";
    }
    }
