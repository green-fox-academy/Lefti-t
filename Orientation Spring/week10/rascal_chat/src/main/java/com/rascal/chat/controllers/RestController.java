package com.rascal.chat.controllers;


import com.rascal.chat.models.User;
import com.rascal.chat.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.ServerRequest;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    final
    UserServiceImpl userService;

    public RestController(UserServiceImpl userService) {
        this.userService = userService;
    }

    /*
     * Example of sending a postRequset with restTemplate with just body
     * body can be represented by: Map<String, Object> or Models objects itself
     * Returns the whole JSON response parsed to User.class
     * */
    @GetMapping("/register")
    ResponseEntity<?> register() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://rascals-chat.herokuapp.com/api/user/register";
    userService.registerUser()

        ResponseEntity<?> response = restTemplate.postForEntity(url, data, User.class);

        User user = (User) response.getBody();
        return response;
    }

    /*
     * Example of sending a postRequset with restTemplate with just body
     * body can be represented by: Map<String, Object> or Models objects itself
     * Returns the whole JSON response (using String.class)
     * */
    @GetMapping("/register-string")
    ResponseEntity<?> registerString() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://rascals-chat.herokuapp.com/api/user/register";
        Map<String, Object> data = new HashMap<>();
        data.put("login", "u8");
        data.put("password", "123");

        ResponseEntity<?> response = restTemplate.postForEntity(url, data, String.class);

        return response;
    }


    /*
     * Example of sending a postRequest with restTemplate with both header and body
     * header can be represented by: HttpHeaders
     * body can be represented by: Map<String, Object> or Models objects itself
     * we can also send, just part of it (just header or just body)
     * Returns the whole JSON response (String.class)
     * */
    @GetMapping("/login")
    ResponseEntity<?> login() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://rascals-chat.herokuapp.com/api/user/login";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        Map<String, Object> data = new HashMap<>();
        data.put("login", "u5");
        data.put("password", "123");

        HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<>(data, headers);

        ResponseEntity<?> response = restTemplate.postForEntity(url, requestEntity, String.class);

        return response;
    }

    /*
     * Example of sending a getRequest with restTemplate with just header
     * body can be represented by: HttpHeaders
     * There is also a getForEntity method in RestTemplate, but we can't send headers with it
     * Returns the whole JSON response (String.class)
     * */
    @GetMapping("/messages")
    ResponseEntity<?> get(@RequestParam String apiKey) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://rascals-chat.herokuapp.com/api/channel/user-channels";
        HttpHeaders headers = new HttpHeaders();
        headers.add("apiKey", apiKey);

        ResponseEntity<String> response = restTemplate.exchange(
                url, HttpMethod.GET, new HttpEntity<>(headers),
                String.class);
        return response;
    }

    /*
     * Example of sending a getRequest with restTemplate with both header and body
     * header can be represented by: HttpHeaders
     * body can be represented by: Map<String, Object> or Models objects itself
     * There is also a getForEntity method in RestTemplate, but we can't send headers or body with it
     * Returns the whole JSON response (String.class)
     * */
    @GetMapping("/messages")
    ResponseEntity<?> getWithHeadersAndBody(@RequestParam String apiKey) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://rascals-chat.herokuapp.com/api/channel/user-channels";
        HttpHeaders headers = new HttpHeaders();
        headers.add("apiKey", apiKey);

        Map<String, Object> data = new HashMap<>();
        data.put("name", "myChannel");
        data.put("description", "This is my channel");

        HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<>(data, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                url, HttpMethod.GET, requestEntity,
                String.class);

        return response;
    }

    /*
     * Example of returning object array as responseEntity
     */
    @GetMapping("/test")
    ResponseEntity<List<User>> test() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "myUser", null));
        users.add(new User(2, "anotherUser", null));
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

}