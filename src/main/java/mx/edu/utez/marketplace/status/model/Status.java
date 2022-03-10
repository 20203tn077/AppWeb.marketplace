package mx.edu.utez.marketplace.status.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mx.edu.utez.marketplace.category.model.Category;
import mx.edu.utez.marketplace.product.model.Product;

import javax.persistence.*;
import java.util.List;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    @OneToMany(mappedBy = "status")
    @JsonIgnore
    private List<Category> categories;
    @OneToMany(mappedBy = "status")
    @JsonIgnore
    private List<Category> subcategories;
    @OneToMany(mappedBy = "status")
    @JsonIgnore
    private List<Product> products;

    public Status() {
    }

    public Status(long id) {
        this.id = id;
    }

    public Status(String description, List<Category> categories, List<Category> subcategories, List<Product> products) {
        this.description = description;
        this.categories = categories;
        this.subcategories = subcategories;
        this.products = products;
    }

    public Status(long id, String description, List<Category> categories, List<Category> subcategories, List<Product> products) {
        this.id = id;
        this.description = description;
        this.categories = categories;
        this.subcategories = subcategories;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Category> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<Category> subcategories) {
        this.subcategories = subcategories;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}