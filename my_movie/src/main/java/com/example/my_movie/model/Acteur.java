package com.example.my_movie.model;

import java.util.Date;

public class Acteur {
    public String nom;
    public String prenom;
    public Date dateDeNaissance;
    public Filme film;

    public Acteur(String nom, String prenom, Date dateDeNaissance, Filme film) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.film = film;
    }
}
