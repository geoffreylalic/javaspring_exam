package com.example.my_movie.model;

import java.util.Date;

public class Filme {
    public String titre;
    public String realisateur;
    public Acteur acteur;
    public Date date;

    public Filme(String titre, String realisateur, Acteur acteur, Date date) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.acteur = acteur;
        this.date = date;
    }
}
