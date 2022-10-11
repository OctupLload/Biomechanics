package com.biomechanics.services;

import com.biomechanics.domain.entities.general.SectionInfosCoach;
import com.biomechanics.domain.entities.sections.SectionInfo;

import java.util.List;

public interface SectionInfoService<T> extends CrudService<T>{
    Iterable<SectionInfo> findByCity(String city);
    Iterable<SectionInfo> findByTitle(String title);
}
