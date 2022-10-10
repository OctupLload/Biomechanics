package com.biomechanics.domain.entities.sections;

import com.biomechanics.domain.entities.coaching.Coach;
import com.biomechanics.domain.entities.general.Address;
import com.biomechanics.domain.entities.general.Contact;
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
@Table(name = "section_infos", schema = "biomechanics")
public class SectionInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "section_info_id")
    private Integer id;

    @Column(name = "section_info_title")
    private String title;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "full_description")
    private String fullDescription;

    @Column(name = "preview_url")
    private String previewUrl;

    @Column(name = "image_url")
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "create_date")
    private String createDate;

    @Column(name = "edit_date")
    private String editDate;

    SectionInfo() {}
}
