package com.example.redditclonespringangular.repository;

import com.example.redditclonespringangular.model.Post;
import com.example.redditclonespringangular.model.User;
import com.example.redditclonespringangular.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
