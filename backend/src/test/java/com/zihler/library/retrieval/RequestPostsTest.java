package com.zihler.library.retrieval;

import com.zihler.posts.retrieval.Posts;
import com.zihler.posts.retrieval.IRetrievePosts;
import com.zihler.posts.retrieval.PostsReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RequestPostsTest {
    @Test
    @DisplayName("returns all posts when requested")
    public void testSubmitHappyCase() {
        IRetrievePosts postsReader = new PostsReader();
        Posts posts = postsReader.getAllPosts();


    }
}
