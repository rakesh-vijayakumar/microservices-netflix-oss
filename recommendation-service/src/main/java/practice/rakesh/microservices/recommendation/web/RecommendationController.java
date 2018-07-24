package practice.rakesh.microservices.recommendation.web;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import practice.rakesh.microservices.recommendation.domain.Recommendation;

@RestController
public class RecommendationController {

	private static final Logger LOG = LoggerFactory.getLogger(RecommendationController.class);

	@GetMapping("/recommendation")
	public List<Recommendation> getRecommendations(@RequestParam(value = "productId", required = true) int productId) {

		LOG.info("/recommendation called, processing time: {}");

		List<Recommendation> list = new ArrayList<>();
		list.add(new Recommendation(productId, 1, "Author 1", 1, "Content 1"));
		list.add(new Recommendation(productId, 2, "Author 2", 2, "Content 2"));
		list.add(new Recommendation(productId, 3, "Author 3", 3, "Content 3"));

		LOG.debug("/recommendation response size: {}", list.size());

		return list;
	}
}
