package com.biomechanics.services.user;

public interface UserService<T>{

    void create(T object);

    void delete (T object);
}
