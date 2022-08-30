package com.projectwebspringboot.repositories;

import com.projectwebspringboot.entities.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CategoryRepository {
    //Map é uma coleção de pares, chave/valor
    private Map<Long, Category> map = new HashMap<>();

    public void save(Category obj) {
		map.put(obj.getId(), obj);
        //Inserindo a categoria dentro do map
    }

    public Category findById(Long id) {
		return map.get(id);
    }

    public List<Category> findAll() {
		return new ArrayList<Category>(map.values());
    }

}