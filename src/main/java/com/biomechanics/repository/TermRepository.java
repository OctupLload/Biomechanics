package com.biomechanics.repository;

import com.biomechanics.domain.entities.terminology.Term;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TermRepository extends CrudRepository<Term, Integer> {
    List<Term> findAll();
}
