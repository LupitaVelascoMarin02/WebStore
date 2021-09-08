package classes;

public class DeliveryComp implements java.io.Serializable {

	private Integer idDeliveryComp;
	private String name;
	private String address;
	private String phone;


	public DeliveryComp() {
	}

	public DeliveryComp(int idDeliveryComp) {
		this.idDeliveryComp =idDeliveryComp;
	}
	
	public DeliveryComp(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public Integer getIdDeliveryComp() {
		return this.idDeliveryComp;
	}

	public void setIdDeliveryComp(Integer idDeliveryComp) {
		this.idDeliveryComp = idDeliveryComp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
