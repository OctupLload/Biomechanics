package com.biomechanics.domain.entities.general;

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
public class Contact {
    private Integer id;

    @OneToMany
    @JoinColumn(name = "type_id")
    private ContactType type;

    private String value;
    private String createDate;
    private String editDate;

    Contact() {
    }
}
