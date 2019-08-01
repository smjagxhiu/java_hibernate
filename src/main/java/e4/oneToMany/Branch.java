package e4.oneToMany;

import javax.persistence.*;

import e1.BaseResource;

@Entity
public class Branch extends BaseResource {
	
	private String address;

	public Branch() {
		super();
	}

	public Branch(String address) {
		super();
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
