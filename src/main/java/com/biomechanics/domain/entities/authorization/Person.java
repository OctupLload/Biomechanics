package com.biomechanics.domain.entities.authorization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons", schema = "biomechanics")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank
    @Size(min = 3, max = 32)
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @NotBlank
    @Size(min = 8, max = 32)
    @Column(name = "phone")
    private String phone;

    @Column(name = "birth_day", insertable = false)
    private String birthDay;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "edit_date")
    private LocalDate editDate;
}
