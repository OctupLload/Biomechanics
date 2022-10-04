package com.biomechanics.domain;


import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "sections")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer section_id;

    @Column(name = "section_title")
    private String sectionTitle;

    @Column(name = "section_description")
    private String sectionDescription;

    @Column(name = "section_preview_url")
    private String sectionPreviewUrl;

    Section() {};

    Section(String sectionTitle, String sectionDescription, String sectionPreviewUrl) {
        this.sectionTitle = sectionTitle;
        this.sectionDescription = sectionDescription;
        this.sectionPreviewUrl = sectionPreviewUrl;
    }

    public void setSectionId(int section_id) {
        this.section_id = section_id;
    }

    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public void setSectionDescription(String sectionDescription) {
        this.sectionDescription = sectionDescription;
    }

    public void setSectionPreviewUrl(String sectionPreviewUrl) {
        this.sectionPreviewUrl = sectionPreviewUrl;
    }
}
