package practice.rakesh.microservices.recommendation.domain;

public class Recommendation {
	private int productId;
	private int recommendationId;
	private String author;
	private int rate;
	private String content;
	
	public Recommendation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recommendation(int productId, int recommendationId, String author, int rate, String content) {
		super();
		this.productId = productId;
		this.recommendationId = recommendationId;
		this.author = author;
		this.rate = rate;
		this.content = content;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getRecommendationId() {
		return recommendationId;
	}

	public void setRecommendationId(int recommendationId) {
		this.recommendationId = recommendationId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}

