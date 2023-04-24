package com.example.demoprojection.service.impl;

import com.example.demoprojection.model.Post;
import com.example.demoprojection.projections.IPostProjecton;
import com.example.demoprojection.repository.IPostRepository;
import com.example.demoprojection.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements IPostService {
    @Autowired
    private IPostRepository postRepository;

    @Override
    public List<IPostProjecton> findAll() {
        return postRepository.findAllPost();
    }

}
