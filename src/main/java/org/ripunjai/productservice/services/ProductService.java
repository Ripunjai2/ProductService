package org.ripunjai.productservice.services;

import org.ripunjai.productservice.exceptions.CategoryNotFoundException;
import org.ripunjai.productservice.exceptions.ProductNotFoundException;
import org.ripunjai.productservice.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long productId) throws ProductNotFoundException;

    List<Product> getAllProducts();

    Product createProduct(Product product) throws CategoryNotFoundException;

    boolean deleteProduct(Long productId);
}