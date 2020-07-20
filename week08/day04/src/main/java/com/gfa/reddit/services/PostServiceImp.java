package com.gfa.reddit.services;

import com.gfa.reddit.models.Post;
import com.gfa.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImp implements  PostService{
    final
    PostRepository postRepository;


    public PostServiceImp(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void upVote(Long id, String title, String url) {
        Post post = new Post(title,url);
        post.setId(id);
        post.setVoteCount(+1);
        this.postRepository.save(post);
    }

    @Override
    public void downVote(Long id) {
        Post post = new Post();
        post.setId(id);
        post.setVoteCount(-1);
        this.postRepository.save(post);
    }

    @Override
    public void save(String title, String url) {
        Post post = new Post(title,url);
        this.postRepository.save(post);
    }

    @Override
    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post getPost(Long id) {
        return postRepository.getOne(id);
    }

    public void savePost(Post post) {
        postRepository.save(post);
    }
}
