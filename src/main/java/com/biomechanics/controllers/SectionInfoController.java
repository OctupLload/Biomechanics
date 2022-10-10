package com.biomechanics.controllers;

import com.biomechanics.domain.entities.sections.SectionInfo;
import com.biomechanics.services.SectionInfoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/sections")
@AllArgsConstructor
public class SectionInfoController {

    private final SectionInfoServiceImpl sectionInfoServiceImpl;

    @PostMapping
    public void create(@RequestBody SectionInfo sectionInfo) {
        sectionInfoServiceImpl.create(sectionInfo);
    }

    @DeleteMapping("/")
    public ResponseEntity<?> deleteById(@RequestBody SectionInfo sectionInfo) {
        sectionInfoServiceImpl.delete(sectionInfo);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Optional<SectionInfo> getById(@PathVariable Integer id) {
        return sectionInfoServiceImpl.findById(id);
    }

    @GetMapping
    public List<SectionInfo> findByCity(@RequestParam("city") String city) {
        return sectionInfoServiceImpl.findByCity(city);
    }

    @GetMapping
    public List<SectionInfo> findByTitle(@RequestParam("title") String title) {
        return sectionInfoServiceImpl.findByTitle(title);
    }

}
