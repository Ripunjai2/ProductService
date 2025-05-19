package org.ripunjai.productservice.services;

import org.ripunjai.productservice.models.Product;

import java.util.List;

public interface ProductService {
    String getSingleProduct(Long productId);

    List<Product> getAllProducts();

    Product createProduct(Product product);

    boolean deleteProduct(Long productId);
}