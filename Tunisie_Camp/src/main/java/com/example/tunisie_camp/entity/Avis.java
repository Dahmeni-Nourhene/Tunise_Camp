package com.example.tunisie_camp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Avis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAvis;
    @Column(unique = true)
    private String sujet;
    private String contenu;
    private LocalDate dateAvis;
    private int note;
    @ManyToOne
    @JsonIgnore
    Utilisateur utilisateur;

}
