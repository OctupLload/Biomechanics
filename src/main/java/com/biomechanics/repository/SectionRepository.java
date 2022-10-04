package com.biomechanics.repository;

import com.biomechanics.domain.Section;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends CrudRepository<Section, Integer> {
}
