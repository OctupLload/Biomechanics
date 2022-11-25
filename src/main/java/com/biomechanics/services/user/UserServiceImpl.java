package com.biomechanics.services.user;

import com.biomechanics.domain.entities.authorization.User;
import com.biomechanics.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService<User>{

    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    public int existsByLoginAndPassword(String login, String password) {
        return userRepository.findUserByLoginAndPassword(login, password);
    }

    public User getByLogin(String login) {
        return userRepository.getByLogin(login);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }
}
