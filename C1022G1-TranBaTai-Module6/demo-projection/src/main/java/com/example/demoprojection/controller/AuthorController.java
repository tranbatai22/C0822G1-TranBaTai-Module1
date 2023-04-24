package com.example.demoprojection.controller;

import com.example.demoprojection.model.Author;
import com.example.demoprojection.projections.IAuthorProjection;
import com.example.demoprojection.service.IAuthorService;
import org.jboss.jandex.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/author")
@CrossOrigin("*")
public class AuthorController {
    @Autowired
    private IAuthorService authorService;

    @GetMapping("")
    public ResponseEntity<List<IAuthorProjection>> getAllAuthor() {
        List<IAuthorProjection> iAuthorProjections = authorService.findAll();
        if (iAuthorProjections == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(iAuthorProjections, HttpStatus.OK);
        }
    }
}
