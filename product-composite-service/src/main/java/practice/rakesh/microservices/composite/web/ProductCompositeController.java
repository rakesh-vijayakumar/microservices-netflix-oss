package practice.rakesh.microservices.composite.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import practice.rakesh.microservices.composite.client.ProductServiceProxy;
import practice.rakesh.microservices.composite.client.RecommendationServiceProxy;
import practice.rakesh.microservices.composite.client.ReviewServiceProxy;
import practice.rakesh.microservices.composite.domain.Product;
import practice.rakesh.microservices.composite.domain.ProductComposite;

@RestController
public class ProductCompositeController {

	private ProductServiceProxy productServiceProxy;

	private RecommendationServiceProxy recommendationServiceProxy;

	private ReviewServiceProxy reviewServiceProxy;

	@Autowired
	public ProductCompositeController(ProductServiceProxy productServiceProxy,
			RecommendationServiceProxy recommendationServiceProxy, ReviewServiceProxy reviewServiceProxy) {
		super();
		this.productServiceProxy = productServiceProxy;
		this.recommendationServiceProxy = recommendationServiceProxy;
		this.reviewServiceProxy = reviewServiceProxy;
	}

	@GetMapping("/{productId}")
	public ProductComposite getProductInfo(@PathVariable int productId) {

		ProductComposite productComposite = new ProductComposite();

		Product product = productServiceProxy.findProductById(productId);

		productComposite.setProductId(productId);
		productComposite.setName(product.getName());
		productComposite.setWeight(product.getWeight());
		productComposite.setRecommendations(recommendationServiceProxy.getRecommendations(productId));
		productComposite.setReviews(reviewServiceProxy.getReviews(productId));

		return productComposite;
	}
}
