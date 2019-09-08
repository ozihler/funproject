package com.zihler.library.retrieval;

import com.zihler.posts.retrieval.Posts;
import com.zihler.posts.retrieval.IRetrievePosts;
import com.zihler.posts.retrieval.PostsReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetrievePostsTest {
    @Test
    @DisplayName("returns all posts when requested")
    public void testSubmitHappyCase() {
        IRetrievePosts postsReader = new PostsReader();

        Posts posts = postsReader.getAllPosts();

        assertEquals(3, posts.count());

    }
}
