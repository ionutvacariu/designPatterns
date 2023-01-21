package application.spring.controllers;

import application.spring.database.DAO;
import application.spring.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import prototype.Prototype;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SecondController {

    @Autowired
    private DAO dao;

    @Autowired
    private Prototype prototype;


    private static List<Model> models = new ArrayList<>();

    static {
        Model m = new Model();
        m.setAge(123);
        m.setName("Ion");
        models.add(m);
        Model mm = new Model();
        mm.setName("Vasi");
        mm.setAge(123);
        models.add(mm);
    }

    @GetMapping("/secondContr")
    public List<Model> index() {


        return models;
    }


    @GetMapping(path = "/secondContr/{id}")
    public Model justOneWithId(@PathVariable Integer id) {

        return models.get(id);
    }

}