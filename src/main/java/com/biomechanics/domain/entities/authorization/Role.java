package com.biomechanics.domain.entities.authorization;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "roles", schema = "biomechanics")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @JsonIgnore
    @Column(name = "create_date")
    private LocalDate createDate;

    @JsonIgnore
    @Column(name = "edit_date")
    private LocalDate editDate;
}
