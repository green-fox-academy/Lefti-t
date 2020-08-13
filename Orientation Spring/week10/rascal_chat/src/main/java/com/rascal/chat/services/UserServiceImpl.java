package com.rascal.chat.services;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public String[] registerUser(String userName, String password) {
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "https://rascals-chat.herokuapp.com/api/user/register";
        Map<String, Object> data = new HashMap<>();
        data.put("login", userName);
        data.put("password", password);

        return new String[0];
    }

    @Override
    public String[] loginUser(String userName, String password) {
        return new String[0];
    }
}
