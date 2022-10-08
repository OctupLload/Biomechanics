package com.biomechanics.domain.entities.general;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Person {
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthday;
    private String contactPhone;
    private String createDate;
    private String editDate;

    Person() {
    }
}
