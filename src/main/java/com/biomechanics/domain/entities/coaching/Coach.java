package com.biomechanics.domain.entities.coaching;

import com.biomechanics.domain.entities.general.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Coach {
    private Integer id;
    private String info;
    private int experience;

    @OneToMany
    @JoinColumn(name = "person_id")
    private Person person;

    @OneToMany
    @JoinColumn(name = "belt_id")
    private Belt belt;

    private String createDate;
    private String editDate;

    Coach() {}
}
