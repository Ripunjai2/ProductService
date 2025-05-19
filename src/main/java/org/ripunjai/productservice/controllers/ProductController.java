package org.ripunjai.productservice.controllers;

import org.ripunjai.productservice.models.Product;
import org.ripunjai.productservice.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;
    public ProductController(final ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public String getSingleProduct(@PathVariable("id") Long productId) {
        //Should we call FakeStore API here ? No, we should make a call to the Service.
        return productService.getSingleProduct(productId);
    }

    // localhost:8080/products/
    @GetMapping("/")
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }

    // localhost:8080/products/
    @PostMapping()
    public Product createProduct(@RequestBody Product product) {
        return new Product();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") Long productId) {
        return null;
    }

    //Update API's
    // updateProduct() -> PATCH
    // replaceProduct() -> PUT
}