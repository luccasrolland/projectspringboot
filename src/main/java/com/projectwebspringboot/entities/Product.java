package com.projectwebspringboot.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@Entity
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product () {
    }

    public Product (Long id, String name, Double price, Category category) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getString() {
        return name;
    }

    public void setString(String name) {
        this.name = name;
    }

    public Double getDouble() {
        return price;
    }

    public void setDouble(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
