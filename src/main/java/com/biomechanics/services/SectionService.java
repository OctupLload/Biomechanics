package com.biomechanics.services;

import com.biomechanics.domain.Section;
import com.biomechanics.repository.SectionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SectionService implements ServiceImpl{

    private final SectionRepository sectionRepository;

    @Override
    public List<Section> findAll() {

    }

    @Override
    public void deleteById(Integer id) {
        sectionRepository.deleteById(id);
    }

    @Override
    public Optional findById(Integer id) {
        return sectionRepository.findById(id);
    }

    public List<Section> findByCity(String city) {
        return sectionRepository.findByCity(city);
    }

    public List<Section> findByTitle(String title) {
        return sectionRepository.findByTitle();
    }
}
