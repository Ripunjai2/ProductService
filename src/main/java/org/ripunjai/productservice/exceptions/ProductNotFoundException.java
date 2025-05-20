package org.ripunjai.productservice.exceptions;

public class ProductNotFoundException extends Exception {
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    private Long productId;

    public ProductNotFoundException(Long productId, String message) {
        super(message);
        this.productId = productId;
    }

    public ProductNotFoundException(String message) {
        super(message);
    }
}
