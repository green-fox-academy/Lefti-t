package com.gfa.reddit.services;

import com.gfa.reddit.models.User;
import com.gfa.reddit.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    final
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public boolean doesUserExist(String userName) {
        List<User> user = (List<User>) this.userRepository.findAll();
        return user.stream().anyMatch(u -> u.getUsername().toLowerCase().equals(userName.toLowerCase()));
    }

    @Override
    public void saveNewUser(String newUser, String password) {
        this.userRepository.save(new User(newUser,password));

    }

    @Override
    public User getByUserName(String user) {
     return this.userRepository.getByUsername(user);
    }

    @Override
    public boolean validLogin(String username, String password) {
        User loggedIn = this.userRepository.findByUsernameAndPassword(username,password);
        return loggedIn != null;
    }
}
