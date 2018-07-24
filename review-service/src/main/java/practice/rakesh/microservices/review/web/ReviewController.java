package practice.rakesh.microservices.review.web;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import practice.rakesh.microservices.review.domain.Review;

@RestController
public class ReviewController {

	private static final Logger LOG = LoggerFactory.getLogger(ReviewController.class);

	@GetMapping("/review")
	public List<Review> getReviews(@RequestParam(value = "productId", required = true) int productId) {

		LOG.info("/reviews called, processing time: {}");

		List<Review> list = new ArrayList<>();
		list.add(new Review(productId, 1, "Author 1", "Subject 1", "Content 1"));
		list.add(new Review(productId, 2, "Author 2", "Subject 2", "Content 2"));
		list.add(new Review(productId, 3, "Author 3", "Subject 3", "Content 3"));

		LOG.debug("/reviews response size: {}", list.size());

		return list;
	}

}
