package com.biomechanics.controllers;

import com.biomechanics.domain.Section;
import com.biomechanics.repository.SectionRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sections")
@AllArgsConstructor
public class SectionController {

    private final SectionRepository sectionRepository;

    @PostMapping("/")
    public ResponseEntity saveSection(@RequestBody Section section) {
        try {
            sectionRepository.save(section);
            return ResponseEntity.ok("Раздел/тема сохранен");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка сохранения");
        }
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Section> getSections(@PathVariable Integer id){
        try {
            var record = sectionRepository.findById(id);
            return ResponseEntity.of(record);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
