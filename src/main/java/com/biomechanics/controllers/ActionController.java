package com.biomechanics.controllers;

import com.biomechanics.domain.entities.education.Action;
import com.biomechanics.services.education.ActionServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/actions")
@AllArgsConstructor
public class ActionController {

    private final ActionServiceImpl actionServiceImpl;

    @GetMapping
    public List<Action> findAll(){
        return actionServiceImpl.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Action>> getById(@PathVariable Integer id) {
        Optional<Action> action = actionServiceImpl.findById(id);

        if (action.isPresent()) {
            return ResponseEntity.ok().header("Cache-Control", "no-store, no-cache")
                    .header("Pragma", "no-cache").body(action);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(params = "action_id_next")
    public ResponseEntity<List<Action>> getByActionByNext(@RequestParam(value = "action_id_next") Integer action_id_next) {
        return ResponseEntity.ok().body(actionServiceImpl.findByActionIdNext(action_id_next));
    }

    @GetMapping(params = "action_id_prev")
    public ResponseEntity<List<Action>> getByActionByPrev(@RequestParam(value = "action_id_prev") Integer action_id_prev) {
        return ResponseEntity.ok().body(actionServiceImpl.findByActionIdPrev(action_id_prev));
    }

    @PostMapping()
    public ResponseEntity<Void> create(@RequestBody Action action) {
        actionServiceImpl.create(action);
        return ResponseEntity.created(URI.create("/action/" + action.getId())).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestBody Action action) {
        actionServiceImpl.delete(action);
        return ResponseEntity.noContent().build();
    }
}