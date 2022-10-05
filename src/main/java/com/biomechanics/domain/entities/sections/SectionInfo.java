package com.biomechanics.domain.entities.sections;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
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

    SectionInfo(Integer id, String title, String shortDescription, String fullDescription,
                String previewUrl, String imageUrl, Address address, List<Contact> contacts,
                List<Coach> coachCollection, Boolean isActive, String createDate, String editDate) {
        this.id = id;
        this.title = title;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.previewUrl = previewUrl;
        this.imageUrl = imageUrl;
        this.address = address;
        this.contacts = contacts;
        this.coachCollection = coachCollection;
        this.isActive = isActive;
        this.createDate = createDate;
        this.editDate = editDate;
    }
}
