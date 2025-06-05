package org.ripunjai.productservice.controllers;

import org.ripunjai.productservice.services.CategoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(final CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/{id}")
    public void deleteCategory(@PathVariable("id") Long categoryId) {
        categoryService.deleteCategory(categoryId);
    }
}
