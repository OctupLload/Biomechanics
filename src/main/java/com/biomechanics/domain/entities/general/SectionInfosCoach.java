package com.biomechanics.domain.entities.general;

import com.biomechanics.domain.entities.coaching.Coach;
import com.biomechanics.domain.entities.sections.SectionInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "section_infos_coaches")
public class SectionInfosCoach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "section_info_id")
    private SectionInfo sectionInfo;

    @ManyToOne
    @JoinColumn(name = "coach_id")
    private Coach coach;
}
