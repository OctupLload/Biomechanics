package com.biomechanics.domain.entities.general;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class ContactType {
    private Integer id;
    private String type;

    ContactType() {
    }

    ContactType(Integer id, String type) {
        this.id = id;
        this.type = type;
    }
}
