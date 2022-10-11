package com.biomechanics.repository;

import com.biomechanics.domain.entities.sections.SectionInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends CrudRepository<SectionInfo, Integer> {

    @Query("FROM SectionInfo si WHERE si.address.city.title = :city")
    Iterable<SectionInfo> findByCity(String city);

    Iterable<SectionInfo> findByTitle(String title);
}
