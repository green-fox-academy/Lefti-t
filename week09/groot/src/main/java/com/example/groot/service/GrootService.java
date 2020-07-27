package com.example.groot.service;

import com.example.groot.Models.Translated;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Service
public class GrootService {


    public Object translateGroot(String message, HttpServletResponse response){
      Translated translated = new Translated();
        Map<String, Object> translate = new HashMap<>();
          if( message != null) {
              response.setStatus(HttpServletResponse.SC_OK);
              translate.put("received", String.format("%s", message));
              translate.put("translated", String.format("%s", translated.getTranslated()));
              return translate;
          } else {
              response.setStatus(400);
              translate.put("error", new Error("Error,I am Groot!"));
          }
        return translate;
    }
}
