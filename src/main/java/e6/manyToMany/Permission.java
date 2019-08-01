package e6.manyToMany;

import java.util.List;

import javax.persistence.*;

import e1.BaseResource;

@Entity
public class Permission extends BaseResource {

	private String name;
	
	@ManyToMany(mappedBy = "permissions")
	private List<Role> roles;

	public Permission() {
		super();
	}

	public Permission(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Permission [name=" + name + ", roles=" + roles + "]";
	}
	
	
	
	
}
