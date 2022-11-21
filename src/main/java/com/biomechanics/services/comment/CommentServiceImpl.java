package com.biomechanics.services.comment;

import com.biomechanics.domain.entities.terminology.Comment;
import com.biomechanics.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommentServiceImpl implements CommentService<Comment>{

    private final CommentRepository commentRepository;

    @Override
    public void create(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void delete(Comment comment) {
        commentRepository.delete(comment);
    }
}
