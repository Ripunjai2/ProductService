package org.ripunjai.productservice.controllers;

import org.ripunjai.productservice.exceptions.CategoryNotFoundException;
import org.ripunjai.productservice.exceptions.ProductNotFoundException;
import org.ripunjai.productservice.models.Product;
import org.ripunjai.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;
    public ProductController(@Qualifier("selfProductService") ProductService productService) {
//    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable("id") Long productId) throws ProductNotFoundException {
//        return productService.getSingleProduct(productId);
//        throw new RuntimeException("Something went wrong");
        ResponseEntity<Product> responseEntity  =
                new ResponseEntity<>(
                        productService.getSingleProduct(productId),
                        HttpStatus.OK
                );

//        Product product = null;
//        try {
//            product = productService.getSingleProduct(productId);
//            responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }

        return responseEntity;
    }

    // localhost:8080/products/
    @GetMapping("/")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // localhost:8080/products/
    @PostMapping()
    public Product createProduct(@RequestBody Product product) throws CategoryNotFoundException {
        System.out.println("Starting from controller" +product);
        return productService.createProduct(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") Long productId) {
        return null;
    }

    //Update API's
    // updateProduct() -> PATCH
    // replaceProduct() -> PUT
}