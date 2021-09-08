package classes;

public class Deliverypack implements java.io.Serializable {

	private Integer idDeliveryPack;
	private Integer packageNum;
	private DeliveryComp idDeliveryComp;

	public Deliverypack() {
	}

	public Deliverypack(int idDeliveryPack) {
		this.idDeliveryPack = idDeliveryPack;
	}
	
	/*public Deliverypack(DeliveryComp idDeliveryComp) {
		this.idDeliveryComp = idDeliveryComp;
	}*/

	public Deliverypack(Integer packageNum, DeliveryComp idDeliveryComp) {
		this.packageNum = packageNum;
		this.idDeliveryComp = idDeliveryComp;
	}

	public Integer getIdDeliveryPack() {
		return this.idDeliveryPack;
	}

	public void setIdDeliveryPack(Integer idDeliveryPack) {
		this.idDeliveryPack = idDeliveryPack;
	}

	public Integer getPackageNum() {
		return this.packageNum;
	}

	public void setPackageNum(Integer packageNum) {
		this.packageNum = packageNum;
	}

	public DeliveryComp getIdDeliveryComp() {
		return this.idDeliveryComp;
	}

	public void setIdDeliveryComp(DeliveryComp idDeliveryComp) {
		this.idDeliveryComp = idDeliveryComp;
	}

}
