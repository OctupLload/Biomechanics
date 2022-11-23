package com.biomechanics.services.education;

import java.util.List;
import java.util.Optional;

public interface ActionService<T>{

    void create(T object);

    List<T> findAll();

    Optional<T> findById(Integer id);

    List<T> findByActionIdNext(Integer actionIdNext);

    List<T> findByActionIdPrev(Integer actionIdPrev);

    void delete(T object);
}