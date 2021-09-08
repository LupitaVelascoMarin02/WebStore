package classes;

public class Country implements java.io.Serializable {

	private Integer idCountry;
	private String name;

	public Country() {
	}

	public Country(int idCountry) {
		this.idCountry = idCountry;
	}

	public Integer getIdCountry() {
		return this.idCountry;
	}

	public void setIdCountry(Integer idCountry) {
		this.idCountry = idCountry;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
