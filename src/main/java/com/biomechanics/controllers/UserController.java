package com.biomechanics.controllers;

import com.biomechanics.domain.entities.authorization.User;
import com.biomechanics.domain.entities.sections.SectionInfo;
import com.biomechanics.services.user.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class UserController {

    private final UserServiceImpl userServiceImpl;

    @PostMapping()
    public ResponseEntity<Void> create(@RequestBody User user) {
        userServiceImpl.create(user);
        return ResponseEntity.created(URI.create("/user/" + user.getId())).build();
    }

    @PostMapping()
    public ResponseEntity<Integer> getExistUserByLoginAndPassword(@RequestParam(value = "login") String login,
                                                               @RequestParam(value = "password") String password) {
        int userExistsOrNot = userServiceImpl.findUserByLoginAndPassword(login, password);
        return ResponseEntity.ok().body(userExistsOrNot);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestBody User user) {
        userServiceImpl.delete(user);
        return ResponseEntity.noContent().build();
    }
}
