package org.ripunjai.productservice.models;

//import lombok.Getter;
//import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

//
//@Getter
//@Setter
@Entity(name = "products")
public class Product extends BaseModel {
    private String title;
    private Double price;
    private String description;
    private String imageUrl;
    @ManyToOne
//    @JoinColumn(name = "category_id")
    private Category category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}