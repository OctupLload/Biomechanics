package com.biomechanics.repository;

import com.biomechanics.domain.entities.authorization.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findAll();

    User getByLogin(String login);
}
