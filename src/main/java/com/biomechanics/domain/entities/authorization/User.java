package com.biomechanics.domain.entities.authorization;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

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

    @NotBlank
    @Size(min = 4, max = 32)
    @Pattern(regexp = "^\\d*[a-zA-Z\\d\\_]*$")
    @Column(name = "login")
    private String login;

    @NotBlank
    @Size(min = 8, max = 32)
    @Pattern(regexp = "^\\d*[a-zA-Z\\d\\_]*$")
    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id", insertable = false)
    @JsonIgnore
    private Role role;

    @Column(name = "is_active", insertable = false)
    @JsonIgnore
    private byte isActive;

    @Column(name = "is_delete", insertable = false)
    @JsonIgnore
    private byte isDelete;

    @NotEmpty
    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Person> person;

    @Column(name = "create_date")
    @JsonIgnore
    private LocalDate createDate;

    @Column(name = "edit_date")
    @JsonIgnore
    private LocalDate editDate;
}
