package com.biomechanics.services.user;

import java.util.List;

public interface UserService<T>{

    List<T> findAll();

    void create(T object);

    void delete (T object);
}
