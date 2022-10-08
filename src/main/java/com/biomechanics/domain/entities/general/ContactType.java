package com.biomechanics.domain.entities.general;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class ContactType {
    private Integer id;
    private String type;

    ContactType() {
    }
}
