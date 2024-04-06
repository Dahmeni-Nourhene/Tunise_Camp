package com.example.tunisie_camp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtilisateur;
    @Column(unique = true)
    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private String numCin;
    @OneToMany(mappedBy = "utilisateur")
    List<Produit> produits= new ArrayList<>();
    @ManyToOne
    @JsonIgnore
    Administrateur administrateur;
    @OneToMany(mappedBy = "utilisateur")
    List<Reservation> reservations = new ArrayList<>();
    @OneToMany(mappedBy = "utilisateur")
    List<Avis> avis = new ArrayList<>();
}
