package com.example.demoprojection.repository;

import com.example.demoprojection.model.Author;
import com.example.demoprojection.projections.IAuthorProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IAuthorRepository extends JpaRepository<Author, Integer> {
    @Query(value = "select * from author a", nativeQuery = true)
    List<IAuthorProjection> findAllAuthor();
}
