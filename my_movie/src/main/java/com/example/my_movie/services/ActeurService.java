package com.example.my_movie.services;

import com.example.my_movie.model.Acteur;
import com.example.my_movie.model.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ActeurService {

    public ArrayList<Acteur> acteurs;
    public ArrayList<Filme> filmes;


    public void initFilmesandActeurs(){
        acteurs = new ArrayList<Acteur>();
        filmes = new ArrayList<Filme>();

        acteurs.add(new Acteur("Lalic", "Geoffrey", "15/12/2000", null));
        acteurs.add(new Acteur("Burel", "Paul","05/10/2000", null));
        acteurs.add(new Acteur("NGUYEN", "Remy","10/02/2000", null));

        Filme filme1 = new Filme("Avengers", "Young thug", acteurs.get(0), "30/01/2023");
        Filme filme2 = new Filme("Titanic", "Lil baby", acteurs.get(1), "31/01/2023");
        Filme filme3 = new Filme("Avatar", "Pop Smoke", acteurs.get(2), "15/01/2023");

        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);

        /*acteurs.get(0).filme = filme1;
        acteurs.get(1).filme = filme2;
        acteurs.get(2).filme = filme3;*/
    }

    public ArrayList<Acteur> getActeurs(){
        initFilmesandActeurs();
        return acteurs;
    }
    public ArrayList<Filme> getFilmes(){
        initFilmesandActeurs();
        return filmes;
    }


}
