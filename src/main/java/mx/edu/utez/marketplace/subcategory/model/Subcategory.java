package mx.edu.utez.marketplace.subcategory.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mx.edu.utez.marketplace.category.model.Category;
import mx.edu.utez.marketplace.product.model.Product;
import mx.edu.utez.marketplace.status.model.Status;

import javax.persistence.*;
import java.util.List;

@Entity
public class Subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
    @OneToMany(mappedBy = "subcategory")
    @JsonIgnore
    private List<Product> products;

    public Subcategory() {
    }

    public Subcategory(String description, Category category, Status status) {
        this.description = description;
        this.category = category;
        this.status = status;
    }

    public Subcategory(long id, String description, Category category, Status status) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.status = status;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}