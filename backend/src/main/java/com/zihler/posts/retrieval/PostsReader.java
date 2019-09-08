package com.zihler.posts.retrieval;

import java.util.Set;

public class PostsReader implements IRetrievePosts {
    @Override
    public Posts getAllPosts() {
        return new Posts(Set.of(new Post(), new Post(), new Post()));
    }
}
