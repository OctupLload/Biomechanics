package com.biomechanics.controllers;

import com.biomechanics.domain.entities.terminology.Comment;
import com.biomechanics.services.comment.CommentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/terms/comments")
@AllArgsConstructor
public class CommentController {

    private final CommentServiceImpl commentServiceImpl;

    @PreAuthorize("hasAnyRole('admin', 'user', 'manager', 'superadmin')")
    @PostMapping()
    public ResponseEntity<Void> create(@RequestBody Comment comment) {
        commentServiceImpl.create(comment);
        return ResponseEntity.created(URI.create("/comment/" + comment.getId())).build();
    }

    @PreAuthorize("hasAnyRole('admin', 'user', 'manager', 'superadmin')")
    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestBody Comment comment) {
        commentServiceImpl.delete(comment);
        return ResponseEntity.noContent().build();
    }
}
