package com.biomechanics.services;

import com.biomechanics.domain.Section;
import com.biomechanics.repository.SectionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class SectionService {

    private final SectionRepository sectionRepository;

    public void createSection(Section section) {
        sectionRepository.save(section);
    }

//    public getSectionAll() {
//
//    }
//
//    public updateSection() {
//
//    }
//
    public void deleteSectionById (Integer id) {
        sectionRepository.deleteById(id);
    }


    public Optional<Section> getSectionById(Integer id) {
        return sectionRepository.findById(id);
    }


}
