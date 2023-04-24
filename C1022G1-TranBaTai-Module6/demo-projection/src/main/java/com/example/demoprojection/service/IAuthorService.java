package com.example.demoprojection.service;

import com.example.demoprojection.model.Author;
import com.example.demoprojection.projections.IAuthorProjection;

import java.util.List;

public interface IAuthorService {
    List<IAuthorProjection> findAll();
}
