package com.biomechanics.services;

import java.util.List;
import java.util.Optional;

public interface CrudService<T>{

    void create(T object);

    Iterable<T> findAll();

    Optional<T> findById(Integer id);

    void delete (T object);
}
