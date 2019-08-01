package e4.oneToMany;

import java.util.List;

import javax.persistence.*;

import e2.inheritance.Company;

@Entity
public class Lab extends Company {
	
	private String extraLabInfo;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "labId", referencedColumnName = "id")
	private List<Branch> branches;

	public Lab() {
		super();
	}

	public Lab(String name, String extraLabInfo, List<Branch> branches) {
		super(name);
		this.extraLabInfo = extraLabInfo;
		this.branches = branches;
	}

	public String getExtraLabInfo() {
		return extraLabInfo;
	}

	public void setExtraLabInfo(String extraLabInfo) {
		this.extraLabInfo = extraLabInfo;
	}

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	
	

}
