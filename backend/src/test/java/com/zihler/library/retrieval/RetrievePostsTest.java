package com.zihler.library.retrieval;

import com.zihler.posts.retrieval.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetrievePostsTest {
    @Test
    @DisplayName("returns all posts when requested")
    public void testSubmitHappyCase() {
        PostRepository postRepository = new InMemoryPostRepository();

        IRetrievePosts postsReader = new PostsReader(postRepository);

        Posts posts = postsReader.getAllPosts();

        assertEquals(3, posts.count());

    }
}
