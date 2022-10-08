package com.biomechanics.domain.entities.coaching;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class City {
    private Integer id;
    private String title;
    private String shortDescription;
    private String longDescription;

    City() {}
}
