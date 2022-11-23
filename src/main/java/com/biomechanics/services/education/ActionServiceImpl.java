package com.biomechanics.services.education;

import com.biomechanics.domain.entities.education.Action;
import com.biomechanics.repository.ActionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ActionServiceImpl implements ActionService<Action> {

    private final ActionRepository actionRepository;

    @Override
    public void create(Action action) {
        actionRepository.save(action);
    }

    @Override
    public List<Action> findAll() {
        return actionRepository.findAll();
    }

    @Override
    public Optional<Action> findById(Integer id) {
        return actionRepository.findById(id);
    }

    @Override
    public List<Action> findByActionIdNext(Integer actionIdNext) {
       return actionRepository.findByActionIdNext(actionIdNext);
    }

    @Override
    public List<Action> findByActionIdPrev(Integer actionIdPrev) {
        return actionRepository.findByActionByPrev(actionIdPrev);
    }

    @Override
    public void delete(Action action) {
        actionRepository.delete(action);
    }
}