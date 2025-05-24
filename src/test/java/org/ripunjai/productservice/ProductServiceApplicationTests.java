package org.ripunjai.productservice;

import org.junit.jupiter.api.Test;
import org.ripunjai.productservice.models.Product;
import org.ripunjai.productservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.metadata.DataSourcePoolMetadataProvider;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class ProductServiceApplicationTests {

	@Autowired
	private ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testQuery() {
		Optional<Product> productOptional = productRepository.findById(1L);

		System.out.println("DEBUG-1"+productOptional.isPresent());

		Product product = productRepository.findProductWithGivenId(1L);

		System.out.println("DEBUG-2"+ product.getTitle());
	}
}
