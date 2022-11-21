package com.biomechanics.services.comment;

public interface CommentService<T> {

    void create(T object);

    void delete (T object);
}
