package com.zihler.posts.retrieval;

public class PostsReader implements IRetrievePosts {
    private final PostRepository posts;

    public PostsReader(PostRepository posts) {
        this.posts = posts;
    }

    @Override
    public Posts getAllPosts() {
        return posts.findAll();
    }

}
