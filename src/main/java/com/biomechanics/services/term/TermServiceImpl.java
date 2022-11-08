package com.biomechanics.services.term;

import com.biomechanics.domain.entities.terminology.Term;
import com.biomechanics.repository.TermRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TermServiceImpl implements TermService<Term>{

    private final TermRepository termRepository;

    @Override
    public void create(Term term) {
        termRepository.save(term);
    }

    @Override
    public List<Term> findAll() {
        return termRepository.findAll();
    }

    @Override
    public Optional<Term> findById(Integer id) {
        return termRepository.findById(id);
    }

    @Override
    public void delete(Term term) {
        termRepository.delete(term);
    }
}
