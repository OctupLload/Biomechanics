package com.biomechanics.domain.entities.general;

import lombok.AllArgsConstructor;
import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "contacts", schema = "biomechanics")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "contact_type_id")
    private ContactType type;

    @Column(name = "value")
    private String value;

    @Column(name = "create_date")
    private String createDate;

    @Column(name = "edit_date")
    private String editDate;

    Contact() {
    }
}
