package com.biomechanics.domain.entities.coaching;

import com.biomechanics.domain.entities.general.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Coach {
    private Integer id;
    private String info;
    private int experience;
    private Person person;
    private Belt belt;
    private String createDate;
    private String editDate;

    Coach() {}
}
