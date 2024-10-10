package com.example.presence.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "etudiants")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "departement", unique = true)
    private String departement;
    @Column(name = "date_inscription", unique = true)
    private Date date_inscription;

    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Presence> presences;
    // Getters et Setters
}
