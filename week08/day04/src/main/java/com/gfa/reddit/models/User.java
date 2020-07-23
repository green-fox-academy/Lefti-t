package com.gfa.reddit.models;

import javax.persistence.*;
import java.util.List;

@Entity

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String username;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User(Long userId, String username, String email, String password, List<Post> posts) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.posts = posts;
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.posts = null;
    }

    public User() {

    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
