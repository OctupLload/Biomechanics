package com.biomechanics.domain.entities.sections;

import com.biomechanics.domain.entities.authorization.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "coaches", schema = "biomechanics")
public class Coach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "info")
    private String info;

    @Column(name = "experience")
    private int experience;

    @Column(name = "photo_url")
    private String photoUrl;

    @Column(name = "photo_preview_url")
    private String photoPreviewUrl;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @ManyToOne
    @JoinColumn(name = "belt_id")
    private Belt belt;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "edit_date")
    private LocalDate editDate;
}
