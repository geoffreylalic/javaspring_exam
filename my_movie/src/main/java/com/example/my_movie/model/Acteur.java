package com.example.my_movie.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Acteur {
    public String nom;
    public String prenom;
    public String dateDeNaissance;
    public Filme filme;

    public Acteur(String nom, String prenom, String dateDeNaissance, Filme filme) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.filme = filme;
    }
}
