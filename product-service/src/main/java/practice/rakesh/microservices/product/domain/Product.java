package practice.rakesh.microservices.product.domain;

public class Product {

	private int productId;

	private String name;

	private float weight;

	public Product() {
	}

	public Product(int productId, String name, float weight) {
		super();
		this.productId = productId;
		this.name = name;
		this.weight = weight;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

}
