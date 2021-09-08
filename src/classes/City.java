package classes;

public class City implements java.io.Serializable {

	private Integer idCity;
	private String name;
	private int idState;

	public City() {
	}

	public City(int idCity, int idState) {
		this.idCity = idCity;
		this.idState = idState;
	}

	public Integer getIdCity() {
		return this.idCity;
	}

	public void setIdCity(Integer idCity) {
		this.idCity = idCity;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdState() {
		return this.idState;
	}

	public void setIdState(int idState) {
		this.idState = idState;
	}

}
