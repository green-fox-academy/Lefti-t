package com.gfa.reddit.services;

import com.gfa.reddit.models.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    boolean doesUserExist(String userName);

    void saveNewUser(String newUser, String password);

    User getByUserName(String user);

    boolean validLogin(String userName, String password);


}
