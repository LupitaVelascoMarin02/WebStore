package classes;

import java.util.Date;

public class POrder implements java.io.Serializable {

	private Integer idPOrder;
	private Client Client;
	private Date datePOrder;
	private Deliverypack DeliveryPack;

	public POrder() {
	}
	
	public POrder(int idPOrder) {
		this.idPOrder = idPOrder;
	}

	public POrder(Client Client, Deliverypack DeliveryPack) {
		this.Client = Client;
		this.DeliveryPack = DeliveryPack;
	}

	public POrder(Client Client, Date datePOrder, Deliverypack DeliveryPack) {
		this.Client = Client;
		this.datePOrder = datePOrder;
		this.DeliveryPack = DeliveryPack;
	}

	public Integer getIdPOrder() {
		return this.idPOrder;
	}

	public void setIdPOrder(Integer idPOrder) {
		this.idPOrder = idPOrder;
	}

	public Client getIdClient() {
		return this.Client;
	}

	public void setIdClient(Client idClient) {
		this.Client = Client;
	}

	public Date getDatePOrder() {
		return this.datePOrder;
	}

	public void setDatePOrder(Date datePOrder) {
		this.datePOrder = datePOrder;
	}

	public Deliverypack getIdDeliveryPack() {
		return this.DeliveryPack;
	}

	public void setIdDeliveryPack(Deliverypack idDeliveryPack) {
		this.DeliveryPack = DeliveryPack;
	}

}
