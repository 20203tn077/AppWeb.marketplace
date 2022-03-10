package mx.edu.utez.marketplace.product.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mx.edu.utez.marketplace.product.model.Product;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ProductImageDTO {
    private long id;
    private String name;
    private String filebase64;

    public ProductImageDTO() {
    }

    public ProductImageDTO(String name, String filebase64) {
        this.name = name;
        this.filebase64 = filebase64;
    }

    public ProductImageDTO(long id, String name, String filebase64) {
        this.id = id;
        this.name = name;
        this.filebase64 = filebase64;
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

    public String getFilebase64() {
        return filebase64;
    }

    public void setFilebase64(String filebase64) {
        this.filebase64 = filebase64;
    }
}
