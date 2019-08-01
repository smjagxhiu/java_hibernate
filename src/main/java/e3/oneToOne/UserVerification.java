package e3.oneToOne;

import javax.persistence.*;

import e1.BaseResource;

@Entity
public class UserVerification extends BaseResource {
	
	private String username;
	private String password;
	
	@OneToOne(mappedBy = "userVerification")
	private User user;
	
	public UserVerification() {
		super();
	}

	public UserVerification(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
		this.user.setId(this.getId());
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
