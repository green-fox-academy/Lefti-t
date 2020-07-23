package com.gfa.reddit.controllers;

import com.gfa.reddit.models.Post;
import com.gfa.reddit.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping({"/","/index"})
    public String main(Model model) {
        model.addAttribute("post", postService.getPosts());
        return "index";
    }

    @GetMapping("/new-post")
    public String addPost(Model model) {
        Post post = new Post();
        model.addAttribute("post", post);
        return "new-post";
    }


    @PostMapping("/add-post")
    public String savePost(@ModelAttribute Post post) {
        postService.save(post.getTitle(),post.getUrl());
        return "redirect:/index";
    }



    @GetMapping("{id}/upvote")
    public String upVotePOST(@PathVariable(name = "id") long id){
       postService.upVote(id);
        return "redirect:/index";
    }

    @GetMapping("{id}/downvote")
    public String downVotePOST(@PathVariable(name = "id") long id){
        postService.downVote(id);
        return "redirect:/index";
    }
}
