package com.biomechanics.domain.entities.authorization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users", schema = "biomechanics")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotEmpty
    @Size(min = 4, max = 32)
    @Pattern(regexp = "^\\d*[a-zA-Z\\d\\_]*$")
    @Column(name = "login")
    private String login;

    @NotEmpty
    @Size(min = 8, max = 32)
    @Pattern(regexp = "^\\d*[a-zA-Z\\d\\_]*$")
    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id", insertable = false)
    private Role role;

    @Column(name = "is_active", insertable = false)
    private byte isActive;

    @Column(name = "is_delete", insertable = false)
    private byte isDelete;

    @NotEmpty
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "edit_date")
    private LocalDate editDate;
}
