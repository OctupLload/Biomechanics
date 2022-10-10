package com.biomechanics.domain.entities.coaching;

import com.biomechanics.domain.entities.general.Person;
import com.biomechanics.domain.entities.general.SectionInfosCoach;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "coaches", schema = "biomechanics")
public class Coach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coach_id")
    private Integer id;

    @Column(name = "coach_info")
    private String info;

    @Column(name = "experience")
    private int experience;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @ManyToOne
    @JoinColumn(name = "belt_id")
    private Belt belt;

    @Column(name = "create_date")
    private String createDate;

    @Column(name = "edit_date")
    private String editDate;

    Coach() {}
}
