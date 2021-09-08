package classes;

public class ArticlepOrder implements java.io.Serializable {

	private Integer idArticlePOrder;
	private Article article;
	private POrder  pOrder;
	private Integer number;
	private int idArticle;

	public ArticlepOrder() {
	}

	public ArticlepOrder(Article article, POrder pOrder) {
		this.article = article;
		this. pOrder = pOrder;
	}

	public ArticlepOrder(Article article, POrder pOrder, Integer number) {
		this.article = article;
		this. pOrder = pOrder;
		this.number = number;
	}

	public Integer getIdArticlePOrder() {
		return this.idArticlePOrder;
	}

	public void setIdArticlePOrder(Integer idArticlePOrder) {
		this.idArticlePOrder = idArticlePOrder;
	}

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public POrder getPOrder() {
		return this.pOrder;
	}

	public void setPOrder(POrder pOrder) {
		this.pOrder = pOrder;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}
