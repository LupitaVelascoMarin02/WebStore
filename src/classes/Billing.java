package classes;

import java.util.Date;

public class Billing implements java.io.Serializable {

	private Integer idBilling;
	private String invoice;
	private Double amount;
	private Date date;
	private POrder POrder;

	public Billing() {
	}

	public Billing(Date date, POrder POrder) {
		this.date = date;
		this.POrder = POrder;
	}

	public Billing(String invoice, Double amount, Date date, POrder POrder) {
		this.invoice = invoice;
		this.amount = amount;
		this.date = date;
		this.POrder = POrder;
	}

	public Integer getIdBilling() {
		return this.idBilling;
	}

	public void setIdBilling(Integer idBilling) {
		this.idBilling = idBilling;
	}

	public String getInvoice() {
		return this.invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public POrder getPOrder() {
		return this.POrder;
	}

	public void setPOrder(POrder POrder) {
		this.POrder = POrder;
	}

}
