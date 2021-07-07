package com.example.redditclonespringangular.repository;

import com.example.redditclonespringangular.model.Post;
import com.example.redditclonespringangular.model.Subreddit;
import com.example.redditclonespringangular.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
