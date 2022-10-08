package com.biomechanics.controllers;

import com.biomechanics.domain.Section;
import com.biomechanics.services.SectionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/sections")
@AllArgsConstructor
public class SectionController {

    private final SectionService sectionService;

    @GetMapping(value="/{id}")
    public ResponseEntity<Section> getSections(@PathVariable Integer id){
        return ResponseEntity.of(sectionService.findById(id));
    }

    @PostMapping("/deleteById/{id}")
    public ResponseEntity<?> deleteSectionById(@PathVariable Integer id) {
        sectionService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/findByCity/{city}")
    public ResponseEntity<Section> findSectionByCity(@PathVariable String city) {
        return ResponseEntity.of(sectionService.findByCity(city));
    }
}
