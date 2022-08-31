package com.projectwebspringboot.resources;

import com.projectwebspringboot.entities.Category;
import com.projectwebspringboot.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//Classe será um recurso REST
@RestController
//Caminho pelo qual o recurso iirá responder
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
    private CategoryRepository categoryRepository;

    //Requisição no caminho, chamará o método
    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = categoryRepository.findAll();
        return ResponseEntity.ok().body(list);
    } //Responde nossa requisição no endpoint com os dados acima

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category cat = categoryRepository.findById(id).get();
        return ResponseEntity.ok().body(cat);
    }
}

