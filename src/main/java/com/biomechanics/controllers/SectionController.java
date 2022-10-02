package com.biomechanics.controllers;

import com.biomechanics.domain.Section;
import com.biomechanics.repository.SectionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sections")
public class SectionController {

    private final SectionRepository sectionRepository;

    public SectionController(SectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository;
    }

    @PostMapping("/")
    public ResponseEntity saveSection(@RequestBody Section section) {
        try {
            sectionRepository.save(section);
            return ResponseEntity.ok("Раздел/тема сохранен");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка сохранения");
        }
    }

    @GetMapping
    public ResponseEntity getSections(){
        try {
            return ResponseEntity.ok("Сервер работает");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
