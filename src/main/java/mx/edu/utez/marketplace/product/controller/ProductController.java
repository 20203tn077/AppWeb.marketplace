package mx.edu.utez.marketplace.product.controller;

import mx.edu.utez.marketplace.product.model.Product;
import mx.edu.utez.marketplace.product.model.ProductImage;
import mx.edu.utez.marketplace.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/api/product")
@CrossOrigin(origins = {"*"})
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public ResponseEntity<Message> getAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    ResponseEntity<Message> getById(@PathVariable("id") long id) {
        return productService.findById(id);
    }

    @PostMapping("/")
    ResponseEntity<Message> save(@RequestBody ProductDTO productDTO) {
        List<ProductImage> images = new ArrayList<>();
        productDTO.getProductImages().forEach(image ->
                images.add(new ProductImage(
                        image.getName(),
                        Base64.getDecoder().decode(image.getFilebase64()),
                        null
                )));
        Product product = new Product(
                productDTO.getName(),
                productDTO.getDescription(),
                productDTO.getBrand(),
                productDTO.getPrice(),
                productDTO.getQuantity(),
                productDTO.getStatus(),
                productDTO.getSubcategory(),
                images
        );
        return new ResponseEntity<>(new Message("Producto guardado", false, productService.save(product)), HttpStatus.OK);
    }

    @PutMapping("/")
    public ResponseEntity<Message> update(@RequestBody ProductDTO productDTO) {
        Product product = new Product(
                productDTO.getName(),
                productDTO.getDescription(),
                productDTO.getBrand(),
                productDTO.getPrice(),
                productDTO.getQuantity(),
                productDTO.getStatus(),
                productDTO.getSubcategory(),
                new ArrayList<>()
        );
        return new ResponseEntity<>(new Message("Producto guardado", false, productService.update(product)), HttpStatus.OK);
    }
}
