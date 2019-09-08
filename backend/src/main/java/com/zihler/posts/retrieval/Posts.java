package com.zihler.posts.retrieval;

import java.util.Set;

public class Posts {

    private Set<Post> posts;

    public Posts(Set<Post> posts) {
        this.posts = posts;
    }

    public int count() {
        return posts.size();
    }
}
