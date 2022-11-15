package com.biomechanics.repository;

import com.biomechanics.domain.entities.terminology.Term;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TermRepository extends CrudRepository<Term, Integer> {
    List<Term> findAll();
}
