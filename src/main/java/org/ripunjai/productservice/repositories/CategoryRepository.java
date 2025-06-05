package org.ripunjai.productservice.repositories;

import org.ripunjai.productservice.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    
    Optional<Category> findByTitle(String title);
    Optional<Category> findById(Long id);
    @Override
    void deleteById(Long id);
}
