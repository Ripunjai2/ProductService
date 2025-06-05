package org.ripunjai.productservice.services;

import org.ripunjai.productservice.exceptions.CategoryNotFoundException;
import org.ripunjai.productservice.exceptions.ProductNotFoundException;
import org.ripunjai.productservice.models.Category;
import org.ripunjai.productservice.models.Product;
import org.ripunjai.productservice.repositories.CategoryRepository;
import org.ripunjai.productservice.repositories.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfProductService")
//@Primary
public class SelfProductService implements ProductService {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product getSingleProduct(Long productId) throws ProductNotFoundException {
        return productRepository.findById(productId)
                .orElseThrow(() -> new ProductNotFoundException(productId, "Product with id " + productId + " doesn't exist."));

    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(Product product) throws CategoryNotFoundException {
        try {

//            Category category = product.getCategory();
////        if(product.getCategory() == null) {
////            throw new CategoryNotFoundException("Product can't be listed without Category");
////        }
//            Optional<Category> OptionalCategory = categoryRepository.findByTitle(product.getCategory().getTitle());
//            if(OptionalCategory.isEmpty()) {
//                category = categoryRepository.save(category);
//            } else {
//                category = OptionalCategory.get();
//            }
//            product.setCategory(category);

            Product savedProduct = productRepository.save(product);
            return savedProduct;
        } catch (Exception e) {
            System.out.println("ERRORRRRRRRRRR "+e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean deleteProduct(Long productId) {
        return false;
    }
}
