package com.example.demoprojection.service.impl;

import com.example.demoprojection.model.Author;
import com.example.demoprojection.projections.IAuthorProjection;
import com.example.demoprojection.repository.IAuthorRepository;
import com.example.demoprojection.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService implements IAuthorService {
    @Autowired
    private IAuthorRepository authorRepository;

    @Override
    public List<IAuthorProjection> findAll() {
        return authorRepository.findAllAuthor();
    }
}
