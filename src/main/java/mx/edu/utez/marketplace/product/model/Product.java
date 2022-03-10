package mx.edu.utez.marketplace.product.model;

import mx.edu.utez.marketplace.status.model.Status;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String brand;
    private double precio;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
    @ManyToOne
    @JoinColumn(name = "subcategory_id")
    private Status subcategory;
    @OneToMany(mappedBy = "product")
    private List<ProductImage> productImages;

    public Product() {
    }

    public Product(String name, String description, String brand, double price, int quantity, Status status, Status subcategory, List<ProductImage> productImages) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.precio = price;
        this.quantity = quantity;
        this.status = status;
        this.subcategory = subcategory;
        this.productImages = productImages;
    }

    public Product(long id, String name, String description, String brand, double precio, int quantity, Status status, Status subcategory, List<ProductImage> productImages) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.precio = precio;
        this.quantity = quantity;
        this.status = status;
        this.subcategory = subcategory;
        this.productImages = productImages;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Status subcategory) {
        this.subcategory = subcategory;
    }

    public List<ProductImage> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<ProductImage> productImages) {
        this.productImages = productImages;
    }
}
