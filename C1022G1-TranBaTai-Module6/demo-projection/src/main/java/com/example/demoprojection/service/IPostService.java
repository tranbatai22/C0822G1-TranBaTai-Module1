package com.example.demoprojection.service;

import com.example.demoprojection.model.Author;
import com.example.demoprojection.model.Post;
import com.example.demoprojection.projections.IAuthorProjection;
import com.example.demoprojection.projections.IPostProjecton;

import java.util.List;

public interface IPostService {
    List<IPostProjecton> findAll();
}
