package com.biomechanics.repository;

import com.biomechanics.domain.entities.general.SectionInfosCoach;
import com.biomechanics.domain.entities.sections.SectionInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectionRepository extends CrudRepository<SectionInfo, Integer> {
//    List<SectionInfo> findByCity(String city);

    List<SectionInfo> findByTitle(String title);
}
