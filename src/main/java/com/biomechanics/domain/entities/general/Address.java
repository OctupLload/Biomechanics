package com.biomechanics.domain.entities.general;

import com.biomechanics.domain.entities.coaching.City;
import com.biomechanics.domain.entities.sections.SectionInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany
    private List<SectionInfo> sectionInfos;

    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

    @Column(name = "address_location")
    private String location;

    @Column(name = "create_date")
    private String createDate;

    @Column(name = "edit_date")
    private String editDate;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    Address() {
    }
}
