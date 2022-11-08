package com.biomechanics.services.sectioninfo;

import com.biomechanics.domain.entities.sections.SectionInfo;
import com.biomechanics.services.CrudService;

public interface SectionInfoService<T> extends CrudService<T> {
    Iterable<SectionInfo> findByCity(String city);
    Iterable<SectionInfo> findByTitle(String title);
}
