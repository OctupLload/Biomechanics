package com.biomechanics.repository;

import com.biomechanics.domain.entities.authorization.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("SELECT COUNT(*) FROM User u WHERE login = :login AND password = :password")
    int findUserByLoginAndPassword(String login, String password);

    List<User> findAll();

    User getByLogin(String login);
}
