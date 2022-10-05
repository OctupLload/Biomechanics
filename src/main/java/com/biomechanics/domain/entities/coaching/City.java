package com.biomechanics.domain.entities.coaching;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class City {
    private Integer id;
    private String title;
    private String shortDescription;
    private String longDescription;

    City() {}

    City(Integer id, String title, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }
}
