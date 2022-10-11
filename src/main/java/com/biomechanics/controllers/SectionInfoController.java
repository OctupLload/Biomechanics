package com.biomechanics.controllers;

import com.biomechanics.domain.entities.sections.SectionInfo;
import com.biomechanics.services.SectionInfoServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/section_info")
@AllArgsConstructor
public class SectionInfoController {

    private final SectionInfoServiceImpl sectionInfoServiceImpl;

    @GetMapping("/{id}")
    public Optional<SectionInfo> getById(@PathVariable Integer id) {
        return sectionInfoServiceImpl.findById(id);
    }

    @GetMapping
    public Iterable<SectionInfo> findAll(){
        return sectionInfoServiceImpl.findAll();
    }

    @GetMapping(value = "city")
    public List<SectionInfo> findByCity(@RequestParam(value = "city") String city) {
        return sectionInfoServiceImpl.findByCity(city);
    }

    @GetMapping(value = "title")
    public List<SectionInfo> findByTitle(@RequestParam(value = "title") String title) {
        return sectionInfoServiceImpl.findByTitle(title);
    }

    @PostMapping()
    public void create(@RequestBody SectionInfo sectionInfo) {
        sectionInfoServiceImpl.create(sectionInfo);
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@RequestBody SectionInfo sectionInfo) {
        sectionInfoServiceImpl.delete(sectionInfo);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
