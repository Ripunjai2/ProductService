package org.ripunjai.productservice.services;

import org.ripunjai.productservice.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {
    //Note: This service class will implement all the API's using FakeStore.
    @Override
    public String getSingleProduct(Long productId) {
        return "xyz"+productId;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public boolean deleteProduct(Long productId) {
        return false;
    }
}