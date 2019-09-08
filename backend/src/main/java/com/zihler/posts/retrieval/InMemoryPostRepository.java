package com.zihler.posts.retrieval;

import java.util.Set;

public class InMemoryPostRepository implements PostRepository {

    @Override
    public Posts findAll() {
        return new Posts(Set.of(new Post(), new Post(), new Post()));
    }
}
