package classes;

public class Article implements java.io.Serializable {

	private Integer idArticle;
	private String articleName;
	private String description;
	private Double price;
	private Integer stock;

	public Article() {
	}

	public Article(int idArticle) {
		this.idArticle = idArticle;
	}
	
	public Article(String articleName, String description, Double price, Integer stock) {
		this.articleName = articleName;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}

	public Integer getIdArticle() {
		return this.idArticle;
	}

	public void setIdArticle(Integer idArticle) {
		this.idArticle = idArticle;
	}

	public String getArticleName() {
		return this.articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStock() {
		return this.stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
