package com.example.demoprojection.repository;

import com.example.demoprojection.model.Post;
import com.example.demoprojection.projections.IPostProjecton;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IPostRepository extends JpaRepository<Post, Integer> {
    @Query("select p.id as id, p.title as title, p.content as content, p.author.name as authorName from Post p")
    List<IPostProjecton> findAllPost();
}
