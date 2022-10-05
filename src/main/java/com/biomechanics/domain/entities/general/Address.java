package com.biomechanics.domain.entities.general;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Address {
    private Integer id;
    private String address;
    private String createDate;
    private String editDate;
    private City city;

    Address() {
    }

    Address(Integer id, String address, String createDate, String editDate, City city) {
        this.id = id;
        this.address = address;
        this.createDate = createDate;
        this.editDate = editDate;
        this.city = city;
    }
}
