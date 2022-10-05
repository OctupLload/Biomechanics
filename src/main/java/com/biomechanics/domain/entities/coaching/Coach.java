package com.biomechanics.domain.entities.coaching;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Coach {
    private Integer id;
    private String info;
    private int experience;
    private Person person;
    private Belt belt;
    private String createDate;
    private String editDate;

    Coach() {}

    public Coach(Integer id, String info, int experience, Person person, Belt belt, String createDate, String editDate) {
        this.id = id;
        this.info = info;
        this.experience = experience;
        this.person = person;
        this.belt = belt;
        this.createDate = createDate;
        this.editDate = editDate;
    }
}
