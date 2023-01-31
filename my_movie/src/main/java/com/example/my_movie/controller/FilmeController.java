package com.example.my_movie.controller;

import com.example.my_movie.model.Acteur;
import com.example.my_movie.model.Filme;
import com.example.my_movie.services.ActeurService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import io.swagger.annotations.ApiResponse;

import java.util.List;

@RestController
@EnableSwagger2
public class FilmeController {
    @Autowired
    ActeurService acteurService;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "La requête a réussi et la ressource demandée a été retournée avec succès."),
            @ApiResponse(code = 400, message = "La requête est mal formée et ne peut pas être traitée par le serveur."),
            @ApiResponse(code = 401, message = "L'authentification a échoué ou n'a pas été fournie."),
            @ApiResponse(code = 403, message = "L'utilisateur n'a pas les autorisations nécessaires pour accéder à la ressource."),
            @ApiResponse(code = 404, message = "La ressource demandée n'a pas été trouvée."),
            @ApiResponse(code = 500, message = "Le serveur a rencontré une erreur interne.")
    })
    @RequestMapping(value = "/acteurs/")
    @ApiOperation(value = "Avoir tous les acteurs", response = Acteur.class, tags = "getActeurs")
    public List<Acteur> getActeurs() {
        return acteurService.getActeurs();
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "La requête a réussi et la ressource demandée a été retournée avec succès."),
            @ApiResponse(code = 400, message = "La requête est mal formée et ne peut pas être traitée par le serveur."),
            @ApiResponse(code = 401, message = "L'authentification a échoué ou n'a pas été fournie."),
            @ApiResponse(code = 403, message = "L'utilisateur n'a pas les autorisations nécessaires pour accéder à la ressource."),
            @ApiResponse(code = 404, message = "La ressource demandée n'a pas été trouvée."),
            @ApiResponse(code = 500, message = "Le serveur a rencontré une erreur interne.")
    })
    @RequestMapping(value = "/acteurs/nom/{nom}")
    @ApiOperation(value = "Avoir un acteur", response = Acteur.class, tags = "getActeur")
    public Acteur getActeur(@PathVariable(value = "nom") String nom) {
        List<Acteur> acteurs = acteurService.getActeurs();
        for (Acteur acteur : acteurs) {
            if(acteur.nom.equals(nom)){
                System.out.println("acteur found:"+ acteur);
                return acteur;
            }
        }
        return null;
    }

    // ------- filmes -------- //
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "La requête a réussi et la ressource demandée a été retournée avec succès."),
            @ApiResponse(code = 400, message = "La requête est mal formée et ne peut pas être traitée par le serveur."),
            @ApiResponse(code = 401, message = "L'authentification a échoué ou n'a pas été fournie."),
            @ApiResponse(code = 403, message = "L'utilisateur n'a pas les autorisations nécessaires pour accéder à la ressource."),
            @ApiResponse(code = 404, message = "La ressource demandée n'a pas été trouvée."),
            @ApiResponse(code = 500, message = "Le serveur a rencontré une erreur interne.")
    })
    @RequestMapping(value = "/filmes/")
    @ApiOperation(value = "Avoir tous les filmes", response = Acteur.class, tags = "getFilmes")
    public List<Filme> getFilmes() {
        return acteurService.getFilmes();
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "La requête a réussi et la ressource demandée a été retournée avec succès."),
            @ApiResponse(code = 400, message = "La requête est mal formée et ne peut pas être traitée par le serveur."),
            @ApiResponse(code = 401, message = "L'authentification a échoué ou n'a pas été fournie."),
            @ApiResponse(code = 403, message = "L'utilisateur n'a pas les autorisations nécessaires pour accéder à la ressource."),
            @ApiResponse(code = 404, message = "La ressource demandée n'a pas été trouvée."),
            @ApiResponse(code = 500, message = "Le serveur a rencontré une erreur interne.")
    })
    @RequestMapping(value = "/filmes/titre/{titre}")
    @ApiOperation(value = "Avoir un filme", response = Acteur.class, tags = "getFilme")
    public Filme getFilme(@PathVariable(value = "titre") String titre) {
        List<Filme> filmes = acteurService.getFilmes();
        for (Filme filme : filmes) {
            if(filme.titre.equals(titre)){
                System.out.println("filme found:"+ filme);
                return filme;
            }
        }
        return null;
    }


}
