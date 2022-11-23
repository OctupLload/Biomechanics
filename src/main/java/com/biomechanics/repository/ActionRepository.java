package com.biomechanics.repository;

import com.biomechanics.domain.entities.education.Action;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActionRepository extends CrudRepository<Action, Integer> {

    @Query("FROM Action a INNER JOIN ActionTree at2 ON a.id = at2.actionIdNext WHERE at2.actionIdPrev = NULL")
    List<Action> findAll();

    @Query("FROM Action a INNER JOIN ActionTree at2 ON a.id = at2.actionIdNext WHERE at2.actionIdNext.id = :actionIdNext")
    List<Action> findByActionIdNext(Integer actionIdNext);

    @Query("FROM Action a INNER JOIN ActionTree at2 ON a.id = at2.actionIdPrev WHERE at2.actionIdPrev.id = :actionIdPrev")
    List<Action> findByActionByPrev(Integer actionIdPrev);
}