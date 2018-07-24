package practice.rakesh.microservices.product.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import practice.rakesh.microservices.product.domain.Product;

@RestController
@RequestMapping("/product")
public class ProductController {
	private static final Logger LOG = LoggerFactory.getLogger(ProductController.class);

	@GetMapping("/{productId}")
	public Product getProduct(@PathVariable int productId) {

		LOG.info("/product called, processing time: {}");

		LOG.debug("/product return the found product");
		return new Product(productId, "name", 123);
	}
}
