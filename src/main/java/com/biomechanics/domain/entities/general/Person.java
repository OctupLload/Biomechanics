package com.biomechanics.domain.entities.general;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
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

    Person(Integer id, String firstName, String middleName, String lastName,
           String birthday, String contactPhone, String createDate, String editDate) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.contactPhone = contactPhone;
        this.createDate = createDate;
        this.editDate = editDate;
    }
}
