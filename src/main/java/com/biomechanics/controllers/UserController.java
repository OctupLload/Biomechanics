package com.biomechanics.controllers;

import com.biomechanics.domain.entities.authorization.User;
import com.biomechanics.domain.entities.sections.SectionInfo;
import com.biomechanics.services.user.UserServiceImpl;
import liquibase.pro.packaged.R;
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

    @PostMapping("/login")
    public ResponseEntity<Integer> getExistUserByLoginAndPassword(@RequestParam(value = "login") String login,
                                                  @RequestParam(value = "password") String password) {
        return ResponseEntity.ok().body(userServiceImpl.findUserByLoginAndPassword(login, password));
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestBody User user) {
        userServiceImpl.delete(user);
        return ResponseEntity.noContent().build();
    }
}
