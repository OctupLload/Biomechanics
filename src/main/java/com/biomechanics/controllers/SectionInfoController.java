package com.biomechanics.controllers;

import com.biomechanics.domain.entities.sections.SectionInfo;
import com.biomechanics.services.SectionInfoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/section_info")
@AllArgsConstructor
public class SectionInfoController {

    private final SectionInfoServiceImpl sectionInfoServiceImpl;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<SectionInfo>> getById(@PathVariable Integer id) {
        Optional<SectionInfo> sectionInfo = sectionInfoServiceImpl.findById(id);

        if (sectionInfo.isPresent()) {
            return ResponseEntity.ok().header("Cache-Control", "no-store, no-cache")
                    .header("Pragma", "no-cache").body(sectionInfo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public List<SectionInfo> findAll(){
        return sectionInfoServiceImpl.findAll();
    }

    @GetMapping(params = "city")
    public List<SectionInfo> getByCity(@RequestParam(value = "city") String city) {
        return sectionInfoServiceImpl.findByCity(city);
    }

    @GetMapping(params = "title")
    public List<SectionInfo> getByTitle(@RequestParam(value = "title") String title) {
        return sectionInfoServiceImpl.findByTitle(title);
    }

    @PostMapping()
    public ResponseEntity<Void> create(@RequestBody SectionInfo sectionInfo) {
        sectionInfoServiceImpl.create(sectionInfo);
        return ResponseEntity.created(URI.create("/section_info/" + sectionInfo.getId())).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestBody SectionInfo sectionInfo) {
        sectionInfoServiceImpl.delete(sectionInfo);
        return ResponseEntity.noContent().build();
    }
}
