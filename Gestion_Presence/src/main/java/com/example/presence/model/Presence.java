package com.example.presence.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "presence")
public class Presence {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "etudiant_id", nullable = false)
  private Etudiant etudiant;

  @Column(name = "date_presence", nullable = false)
  private LocalDate datePresence;

  @Column(name = "statut", nullable = false)
  private String statut;

  // Constructors
  public Presence() {}

  public Presence(Etudiant etudiant, LocalDate datePresence, String statut) {
    this.etudiant = etudiant;
    this.datePresence = datePresence;
    this.statut = statut;
  }

  // Getters and Setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Etudiant getEtudiant() {
    return etudiant;
  }

  public void setEtudiant(Etudiant etudiant) {
    this.etudiant = etudiant;
  }

  public LocalDate getDatePresence() {
    return datePresence;
  }

  public void setDatePresence(LocalDate datePresence) {
    this.datePresence = datePresence;
  }

  public String getStatut() {
    return statut;
  }

  public void setStatut(String statut) {
    this.statut = statut;
  }

  // ToString method
  @Override
  public String toString() {
    return "Presence{" +
            "id=" + id +
            ", etudiant=" + etudiant.getName() + " " + etudiant.getSurname() +
            ", datePresence=" + datePresence +
            ", statut='" + statut + '\'' +
            '}';
  }
}
