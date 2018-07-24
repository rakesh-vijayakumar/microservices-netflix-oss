package practice.rakesh.microservices.composite.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import practice.rakesh.microservices.composite.domain.Review;

@FeignClient(name = "review-service")
public interface ReviewServiceProxy {

	@RequestMapping(value = "/review", method = RequestMethod.GET)
	public List<Review> getReviews(@RequestParam(value = "productId", required = true) int productId);
}
