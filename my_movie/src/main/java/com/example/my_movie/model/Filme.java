package com.example.my_movie.model;

import java.util.Date;

public class Filme {
    public String titre;
    public String realisateur;
    public Acteur acteur;
    public String date;

    public Filme(String titre, String realisateur, Acteur acteur, String date) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.acteur = acteur;
        this.date = date;
    }
}
