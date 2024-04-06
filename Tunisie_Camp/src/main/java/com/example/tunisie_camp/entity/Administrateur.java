package com.example.tunisie_camp.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Administrateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdministrateur;
    @Column(unique = true)
    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    @OneToOne(mappedBy = "administrateur")
    Produit produit;
    @OneToMany(mappedBy = "administrateur")
    List<Utilisateur> utilisateurs = new ArrayList<>();
    @OneToMany(mappedBy = "administrateur")
    List<Reservation> reservations = new ArrayList<>();
}
