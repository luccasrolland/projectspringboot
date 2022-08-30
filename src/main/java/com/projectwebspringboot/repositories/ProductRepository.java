package com.projectwebspringboot.repositories;

import com.projectwebspringboot.entities.Category;
import com.projectwebspringboot.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductRepository {
    //Map é uma coleção de pares, chave/valor
    private Map<Long, Product> map = new HashMap<>();

    public void save(Product obj) {
        map.put(obj.getId(), obj);
        //Inserindo a categoria dentro do map
    }

    public Product findById(Long id) {
        return map.get(id);
    }

    public List<Product> findAll() {
        return new ArrayList<Product>(map.values());
    }

}