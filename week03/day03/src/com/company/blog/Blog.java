package com.company.blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    List<BlogPost> bloglist = new ArrayList<>();

    public Blog() {

    }

    public Blog(List<BlogPost> list){
       this.bloglist = list;
   }


   public void addPosts(BlogPost post){
       this.bloglist.add(post);
   }

   public void deletePosts(BlogPost post){
       this.bloglist.remove(post);
   }

   public void updatePosts(int i, BlogPost j){
       this.bloglist.remove(i);
       this.bloglist.add(i,j);

   }

    @Override
    public String toString() {
        return "Blog{" +
                "bloglist=" + bloglist +
                '}';
    }
}
