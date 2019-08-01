package e5.manyToOne;

import java.util.List;

import javax.persistence.*;

import e1.BaseResource;

@Entity
public class Supplier extends BaseResource {
	
	private String name;
	
	@OneToMany(mappedBy = "supplier")
	private List<Order> orders;

	
	public Supplier() {
		super();
	}

	public Supplier(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	

}
