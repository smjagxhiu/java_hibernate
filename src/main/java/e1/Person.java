package e1;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person extends BaseResource{
	
	@Column(name = "personName")
	private String name;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
