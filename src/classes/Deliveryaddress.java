package classes;

public class Deliveryaddress implements java.io.Serializable {

	private Integer idDeliveryAddress;
	private String street;
	private Integer number;
	private City idCity;
	private Client idClient;
	
	public Deliveryaddress() {
	}
	public Deliveryaddress(int idDeliveryAddress) {
		this.idDeliveryAddress = idDeliveryAddress;
	}

	public Deliveryaddress(String street, City idCity, Client idClient) {
		this.street = street;
		this.idCity = idCity;
		this.idClient = idClient;
	}

	public Deliveryaddress( City idCity, String street, Integer number, Client idClient) {
		this.street = street;
		this.number = number;
		this.idCity = idCity;
		this.idClient = idClient;
	}

	public Integer getIdDeliveryAddress() {
		return this.idDeliveryAddress;
	}

	public void setIdDeliveryAddress(Integer idDeliveryAddress) {
		this.idDeliveryAddress = idDeliveryAddress;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public City getIdCity() {
		return this.idCity;
	}

	public void setIdCity(City idCity) {
		this.idCity = idCity;
	}

	public Client getIdClient() {
		return this.idClient;
	}

	public void setIdClient(Client idClient) {
		this.idClient = idClient;
	}

}
