package com.biomechanics.domain.entities.general;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Contact {
    private Integer id;
    private ContactType type;
    private String value;
    private String createDate;
    private String editDate;

    Contact() {
    }

    Contact(Integer id, ContactType type, String value, String createDate, String editDate) {
        this.id = id;
        this.type = type;
        this.value = value;
        this.createDate = createDate;
        this.editDate = editDate;
    }
}
