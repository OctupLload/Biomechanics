package com.biomechanics.domain.entities.coaching;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Belt {
    private Integer id;
    private String color;
    private byte stripes;
    private String beltPictureUrl;

    Belt() {}

    public Belt(Integer id, String color, byte stripes, String beltPictureUrl) {
        this.id = id;
        this.color = color;
        this.stripes = stripes;
        this.beltPictureUrl = beltPictureUrl;
    }
}
