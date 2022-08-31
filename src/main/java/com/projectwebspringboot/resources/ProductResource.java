package com.projectwebspringboot.resources;

import com.projectwebspringboot.entities.Product;
import com.projectwebspringboot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Classe será um recurso REST
@RestController
//Caminho pelo qual o recurso iirá responder
@RequestMapping(value = "/products")
public class ProductResource {
    @Autowired
    private ProductRepository productRepository;

    //Requisição no caminho, chamará o método
    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = productRepository.findAll();
        return ResponseEntity.ok().body(list);
    } //Responde nossa requisição no endpoint com os dados acima

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product cat = productRepository.findById(id).get();
        return ResponseEntity.ok().body(cat);
    }
}

