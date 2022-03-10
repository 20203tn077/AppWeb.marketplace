package mx.edu.utez.marketplace.product.controller;

import mx.edu.utez.marketplace.product.model.ProductImage;
import mx.edu.utez.marketplace.status.model.Status;

import javax.persistence.*;
import java.util.List;


public class ProductDTO {
    private long id;
    private String name;
    private String description;
    private String brand;
    private double price;
    private int quantity;
    private Status status;
    private Status subcategory;
    private List<ProductImageDTO> productImages;

    public ProductDTO() {
    }

    public ProductDTO(String name, String description, String brand, double price, int quantity, Status status, Status subcategory, List<ProductImageDTO> productImages) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
        this.subcategory = subcategory;
        this.productImages = productImages;
    }

    public ProductDTO(long id, String name, String description, String brand, double price, int quantity, Status status, Status subcategory, List<ProductImageDTO> productImages) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public List<ProductImageDTO> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<ProductImageDTO> productImages) {
        this.productImages = productImages;
    }
}
