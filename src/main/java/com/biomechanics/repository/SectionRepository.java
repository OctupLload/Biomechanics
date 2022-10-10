package com.biomechanics.repository;

import com.biomechanics.domain.entities.general.SectionInfosCoach;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends CrudRepository<SectionInfosCoach, Integer> {
}
