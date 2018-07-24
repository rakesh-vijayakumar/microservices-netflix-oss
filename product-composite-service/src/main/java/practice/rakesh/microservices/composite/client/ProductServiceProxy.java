package practice.rakesh.microservices.composite.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import practice.rakesh.microservices.composite.domain.Product;

@FeignClient(name = "product-service")
public interface ProductServiceProxy {
	
	@RequestMapping(value = "/product/{productId}", method = RequestMethod.GET)
	public Product findProductById(@PathVariable("productId") int productId);
}
