package com.biomechanics.services;

import com.biomechanics.domain.entities.sections.SectionInfo;
import com.biomechanics.repository.SectionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class SectionInfoServiceImpl implements SectionInfoService<SectionInfo> {

    private final SectionRepository sectionRepository;

    @Override
    public void create(SectionInfo sectionInfo) {
        sectionRepository.save(sectionInfo);
    }

    @Override
    public Iterable<SectionInfo> findAll() {
        return sectionRepository.findAll();
    }

    @Override
    public Optional<SectionInfo> findById(Integer id) {
        return sectionRepository.findById(id);
    }

    @Override
    public void delete(SectionInfo sectionInfo) {
        sectionRepository.delete(sectionInfo);
    }

    public Iterable<SectionInfo> findByCity(String city) {
        return sectionRepository.findByCity(city);
    }

    public Iterable<SectionInfo> findByTitle(String title) {
        return sectionRepository.findByTitle(title);
    }
}
