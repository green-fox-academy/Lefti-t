package com.gfa.reddit.models;

import javax.persistence.*;

@Entity

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String url;
    private int voteCount;

    @ManyToOne
    @JoinColumn()
    private User user;

    public Post( String title, String url) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.voteCount = 0;
    }



    public Post() {
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
