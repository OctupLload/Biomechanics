package com.biomechanics.domain.entities.general;

import com.biomechanics.domain.entities.coaching.City;
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
public class Address {
    private Integer id;
    private String address;
    private String createDate;
    private String editDate;

    @OneToMany
    @JoinColumn(name = "city_id")
    private City city;

    Address() {
    }
}
