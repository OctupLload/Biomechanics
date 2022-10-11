package com.biomechanics.services;

import com.biomechanics.domain.entities.general.SectionInfosCoach;
import com.biomechanics.domain.entities.sections.SectionInfo;

import java.util.List;

public interface SectionInfoService<T> extends CrudService<T>{
    List<SectionInfo> findByCity(String city);
    List<SectionInfo> findByTitle(String title);
}
