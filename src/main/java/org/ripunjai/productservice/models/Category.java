package org.ripunjai.productservice.models;

import jakarta.persistence.Entity;

@Entity(name = "categories")
public class Category extends BaseModel {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}