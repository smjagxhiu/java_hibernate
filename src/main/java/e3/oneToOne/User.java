package e3.oneToOne;

import javax.persistence.*;

@Entity
public class User {
	
	@Id
	private Long id;
	
	private String name;
	
	@OneToOne
	@MapsId
	@JoinColumn(name = "id",nullable = false)
	private UserVerification userVerification;

	public User() {}

	public User(String name, UserVerification userVerification) {
		this.name = name;
		this.userVerification = userVerification;
	}
	
	

	public UserVerification getUserVerification() {
		return userVerification;
	}

	public void setUserVerification(UserVerification userVerification) {
		this.userVerification = userVerification;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
