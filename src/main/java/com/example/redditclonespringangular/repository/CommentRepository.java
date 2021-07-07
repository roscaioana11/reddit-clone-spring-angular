package com.example.redditclonespringangular.repository;

import com.example.redditclonespringangular.model.Comment;
import com.example.redditclonespringangular.model.Post;
import com.example.redditclonespringangular.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
