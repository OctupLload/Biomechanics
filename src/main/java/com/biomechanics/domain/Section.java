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
    private Integer id;

    @Column(name = "section_title")
    private String sectionTitle;

    private String section_description;
    private String section_preview_url;

    Section() {};

    Section(String section_title, String section_description, String section_preview_url) {
        this.section_title = section_title;
        this.section_description = section_description;
        this.section_preview_url = section_preview_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSection_title() {
        return section_title;
    }

    public void setSection_title(String section_title) {
        this.section_title = section_title;
    }

    public String getSection_description() {
        return section_description;
    }

    public void setSection_description(String section_description) {
        this.section_description = section_description;
    }

    public String getSection_preview_url() {
        return section_preview_url;
    }

    public void setSection_preview_url(String section_preview_url) {
        this.section_preview_url = section_preview_url;
    }
}
