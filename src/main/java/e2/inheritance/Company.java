package e2.inheritance;

import javax.persistence.*;

import e1.BaseResource;

@Entity
@Table(name = "companies")
@Inheritance(strategy = InheritanceType.JOINED)
public class Company extends BaseResource {
	
	private String name;

	public Company() {}

	public Company(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
