package com.example.groot.controllers;

import com.example.groot.service.GrootService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class GuardianController {

    final
    GrootService grootService;

    public GuardianController(GrootService grootService) {
        this.grootService = grootService;
    }


    @GetMapping("/groot")
    public Object grootTranslator(@RequestParam(required = false) String message, HttpServletResponse response) {
//
//        if (message == null) {
//            return new ResponseEntity<>(grootService.showError( new Error("Error,I am Groot!")), HttpStatus.BAD_GATEWAY)  ;
//        }
        return grootService.translateGroot(message, response);
    }
}
