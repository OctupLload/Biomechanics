package com.biomechanics.controllers;

import com.biomechanics.domain.entities.terminology.Term;
import com.biomechanics.services.term.TermServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/terms")
@AllArgsConstructor
public class TermController {

    private final TermServiceImpl termServiceImpl;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Term>> getById(@PathVariable Integer id) {
        Optional<Term> term = termServiceImpl.findById(id);

        if (term.isPresent()) {
            return ResponseEntity.ok().header("Cache-Control", "no-store, no-cache")
                    .header("Pragma", "no-cache").body(term);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Term>> findAll(){
        return ResponseEntity.ok().body(termServiceImpl.findAll());
    }

    @PostMapping()
    public ResponseEntity<Void> create(@RequestBody Term term) {
        termServiceImpl.create(term);
        return ResponseEntity.created(URI.create("/term/" + term.getId())).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestBody Term term) {
        termServiceImpl.delete(term);
        return ResponseEntity.noContent().build();
    }
}
