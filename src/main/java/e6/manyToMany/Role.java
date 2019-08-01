package e6.manyToMany;

import java.util.List;

import javax.persistence.*;

import e1.BaseResource;

@Entity
public class Role extends BaseResource {
	
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "role_rights", 
		joinColumns = {@JoinColumn(name = "roleId") },
		inverseJoinColumns = {@JoinColumn(name = "permissionId")} )
	private List<Permission> permissions;

	public Role() {
		super();
	}

	public Role(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return "Role [name=" + name + "]";
	}
	
	

}
