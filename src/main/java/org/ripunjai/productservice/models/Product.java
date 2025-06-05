package org.ripunjai.productservice.models;

//import lombok.Getter;
//import lombok.Setter;
import jakarta.persistence.*;

//
//@Getter
//@Setter
@Entity(name = "products")
public class Product extends BaseModel {
    private String title;
    private Double price;
    private String description;
    private String imgUrl;
//    @JoinColumn(name = "category_id")
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}