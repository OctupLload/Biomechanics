package com.biomechanics.domain.entities.sections;

import com.biomechanics.domain.entities.coaching.Coach;
import com.biomechanics.domain.entities.general.Address;
import com.biomechanics.domain.entities.general.Contact;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class SectionInfo {
    private Integer id;
    private String title;
    private String shortDescription;
    private String fullDescription;
    private String previewUrl;
    private String imageUrl;
    private Address address;
    private List<Contact> contacts;
    private List<Coach> coachCollection;
    private Boolean isActive;
    private String createDate;
    private String editDate;

    SectionInfo() {}

}
