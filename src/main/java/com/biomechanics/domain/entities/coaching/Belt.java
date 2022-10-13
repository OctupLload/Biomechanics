package com.biomechanics.domain.entities.coaching;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "belts", schema = "biomechanics")
public class Belt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "belt_id")
    private Integer id;

    @Column(name = "belt_color")
    private String color;

    @Column(name = "stripes")
    private byte stripes;

    @Column(name = "belt_picture_url")
    private String beltPictureUrl;
}
