package com.biomechanics.controllers;

import com.biomechanics.domain.Section;
import com.biomechanics.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class SectionController {
    @Autowired
    private SectionRepository sectionRepository;

    @GetMapping("/sections")
    public String section(@RequestParam int section_id = "section_id" Map<String, Object> model) {
        Iterable<Section> sections = SectionRepository.findById(section_id);

        model.put("sections", sections);

        return "good";
    }
}
