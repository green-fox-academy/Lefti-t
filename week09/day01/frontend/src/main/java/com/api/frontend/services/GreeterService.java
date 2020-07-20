package com.api.frontend.services;

import com.api.frontend.models.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Service
public class GreeterService {

    @Autowired
    public GreeterService() {
    }

    public Object getGreeting(String name, String title, HttpServletResponse response) {
        Greeter greeter = new Greeter();
        Map<String, Object> greet = new HashMap<>();

        if (name != null && title != null) {
            response.setStatus(HttpServletResponse.SC_OK);
            greet.put("welcome_message", String.format("Oh, hi there %s, my dear %s!", name, title));
        }
            if (name == null && title == null) {
                response.setStatus(400);
                greet.put("error", "Please provide a name and a title!");

            } else if (name == null) {
                response.setStatus(400);
                greet.put("error", "Please provide a name!");

            } else if (title == null) {
                response.setStatus(400);
                greet.put("error", "Please provide a title!");
            }

         return greet;
    }
}