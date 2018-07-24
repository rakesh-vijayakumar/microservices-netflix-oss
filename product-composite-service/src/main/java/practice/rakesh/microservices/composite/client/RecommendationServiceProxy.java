package practice.rakesh.microservices.composite.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import practice.rakesh.microservices.composite.domain.Recommendation;

@FeignClient(name = "recommendation-service")
public interface RecommendationServiceProxy {

	@RequestMapping(value = "/recommendation", method = RequestMethod.GET)
	public List<Recommendation> getRecommendations(@RequestParam(value = "productId", required = true) int productId);
}
