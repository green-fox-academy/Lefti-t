package com.api.frontend.services;

import com.api.frontend.models.Greeter;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GreeterService {

    public Object getGreeting() {
        Map<String, Object> greet = new HashMap<>();
        greet.put( "welcome_message", "Oh, hi there " + Greeter.name +, my dear student!");
        return greet;
    }
}
