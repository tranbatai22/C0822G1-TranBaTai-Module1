package com.example.demoprojection.controller;

import com.example.demoprojection.model.Author;
import com.example.demoprojection.model.Post;
import com.example.demoprojection.projections.IAuthorProjection;
import com.example.demoprojection.projections.IPostProjecton;
import com.example.demoprojection.service.IAuthorService;
import com.example.demoprojection.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
@CrossOrigin("*")
public class PostController {
    @Autowired
    private IPostService postService;

    @GetMapping("")
    public ResponseEntity<List<IPostProjecton>> getAllPost() {
        List<IPostProjecton> iPostProjectons = postService.findAll();
        if (iPostProjectons == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(iPostProjectons, HttpStatus.OK);
        }
    }
}
