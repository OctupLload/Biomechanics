package com.biomechanics.domain.entities.coaching;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Belt {
    private Integer id;
    private String color;
    private byte stripes;
    private String beltPictureUrl;

    Belt() {}
}
