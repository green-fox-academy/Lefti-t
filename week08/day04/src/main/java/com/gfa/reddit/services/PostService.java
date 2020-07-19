package com.gfa.reddit.services;

import com.gfa.reddit.models.Post;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PostService {

    void upVote(Long id);

    void downVote(Long id);

    void save(String title, String url);

    List<Post> getPosts();
}
