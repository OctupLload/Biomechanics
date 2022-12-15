package com.biomechanics.domain.entities.terminology;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "terms", schema = "biomechanics")
public class Term {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "video_id")
    private Video video;

    @OneToMany
    @JoinColumn(name = "term_id")
    private List<Comment> comments;

    @ManyToOne
    @JoinColumn(name = "term_type_id")
    private TermType termType;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "edit_date")
    private LocalDate editDate;
}
