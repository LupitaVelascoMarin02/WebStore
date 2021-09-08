package classes;

public class Typecc implements java.io.Serializable {

	private Integer idType;
	private String type;

	public Typecc() {
	}

	public Typecc(String type) {
		this.type = type;
	}

	public Integer getIdType() {
		return this.idType;
	}

	public void setIdType(Integer idType) {
		this.idType = idType;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
