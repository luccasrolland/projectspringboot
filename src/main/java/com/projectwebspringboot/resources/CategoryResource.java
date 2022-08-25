package com.projectwebspringboot.resources;

import com.projectwebspringboot.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Classe será um recurso REST
@RestController
//Caminho pelo qual o recurso iirá responder
@RequestMapping(value = "/categories")
public class CategoryResource {
    //Requisição no caminho, chamará o método
    @GetMapping
    public ResponseEntity<List<Category>> findAll() {...
        return ResponseEntity.ok().body(...);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<...> findById(@PathVariable Long id) {...
        return ResponseEntity.ok().body(...);
    }
}

