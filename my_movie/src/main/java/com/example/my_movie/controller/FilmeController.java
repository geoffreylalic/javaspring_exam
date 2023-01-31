package com.example.my_movie.controller;

import com.example.my_movie.model.Acteur;
import com.example.my_movie.model.Filme;
import com.example.my_movie.services.ActeurService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@EnableSwagger2
public class FilmeController {
    @Autowired
    ActeurService acteurService;

    @RequestMapping(value = "/acteurs/")
    @ApiOperation(value = "Avoir tous les acteurs", response = Acteur.class, tags = "getActeurs")
    public List<Acteur> getActeurs() {
        return acteurService.getActeurs();
    }

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

    @RequestMapping(value = "/filmes/")
    @ApiOperation(value = "Avoir tous les filmes", response = Acteur.class, tags = "getFilmes")
    public List<Filme> getFilmes() {
        return acteurService.getFilmes();
    }

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


    /*@RequestMapping(value = "/getStudent/{name}")
    @ApiOperation(value = "get student by name", response = Student.class, tags = "getStudentByName")
    @ApiResponse(code=404,message = "Student not found.")
    public Student getStudent(@PathVariable(value = "name") String name) {
        // TODO return student
        List<Student> studentsBD = this.getStudents();
        for (Student student : studentsBD) {
            if(student.name.equals(name)){
                System.out.println("student found:"+ student);
                return student;
            }
        }
        return null;
    }

    @RequestMapping(value = "/findEmployeeDetails/{employeeId}", method = RequestMethod.GET)
    public Employee getEmployeeDetails(@PathVariable int employeeId) throws Exception {
        // add
        ArrayList<Employee> employees = getEmployeesService.getEmployees();
        System.out.println("Getting Employee details for " + employeeId);
        for (Employee employee : employees) {
            if (employee.id == employeeId){
                return employee;
            }
        }
        // TODO create get method to find employee by id
        return null;
    }*/

}
