package com.biomechanics.controllers;

import com.biomechanics.domain.entities.authorization.User;
import com.biomechanics.services.user.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class UserController {

    private final UserServiceImpl userServiceImpl;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok().body(userServiceImpl.findAll());
    }

    @PostMapping()
    public ResponseEntity<Void> create(@RequestBody User user) {
        userServiceImpl.create(user);
        return ResponseEntity.created(URI.create("/user/" + user.getId())).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestBody User user) {
        userServiceImpl.delete(user);
        return ResponseEntity.noContent().build();
    }
}
