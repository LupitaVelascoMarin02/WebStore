package classes;

public class State implements java.io.Serializable {

	private Integer idState;
	private String name;
	private int idCountry;

	public State() {
	}

	public State(int idState, int idCountry) {
		this.name = name;
		this.idCountry = idCountry;
	}

	public Integer getIdState() {
		return this.idState;
	}

	public void setIdState(Integer idState) {
		this.idState = idState;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdCountry() {
		return this.idCountry;
	}

	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}

}
