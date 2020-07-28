package com.rascal.chat.services;

import org.springframework.stereotype.Component;

@Component
public interface UserService {

    String[] registerUser(String userName, String password);

    String[] loginUser(String userName, String password);


}
