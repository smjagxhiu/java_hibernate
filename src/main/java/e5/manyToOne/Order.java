package e5.manyToOne;

import javax.persistence.*;

import e1.BaseResource;

@Entity
@Table(name = "sup_orders")
public class Order extends BaseResource {
	
	private int qunatity;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "supplierId")
	private Supplier supplier;

	public Order() {
		super();
	}

	public Order(int qunatity, Supplier supplier) {
		super();
		this.qunatity = qunatity;
		this.supplier = supplier;
	}

	public int getQunatity() {
		return qunatity;
	}

	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	

}
