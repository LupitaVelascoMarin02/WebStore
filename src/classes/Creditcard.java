package classes;

public class Creditcard implements java.io.Serializable {

	private Integer idCreditCard;
	private String number;
	private Typecc idType;
	private String cardholder;
	private Integer idClient;

	
	public Creditcard() {

	}
	
	public Creditcard(int idCreditCard) {
		this.idCreditCard = idCreditCard;
	}

	public Creditcard(String number, Typecc idType, String cardholder, Integer idClient) {
		this.number = number;
		this.idType = idType;
		this.cardholder = cardholder;
		this.idClient = idClient;
	}

	public Integer getIdCreditCard() {
		return this.idCreditCard;
	}

	public void setIdCreditCard(Integer idCreditCard) {
		this.idCreditCard = idCreditCard;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Typecc getIdType() {
		return this.idType;
	}

	public void setIdType(Typecc idType) {
		this.idType = idType;
	}

	public String getCardholder() {
		return this.cardholder;
	}

	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}

	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

}
