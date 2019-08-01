package e2.inheritance;

import javax.persistence.*;

@Entity
public class Clinic extends Company{
	
	private String extraClinicInfo;

	public Clinic() {}

	public Clinic(String name,String extraClinicInfo) {
		super(name);
		this.extraClinicInfo = extraClinicInfo;
	}

	public String getExtraClinicInfo() {
		return extraClinicInfo;
	}

	public void setExtraClinicInfo(String extraClinicInfo) {
		this.extraClinicInfo = extraClinicInfo;
	}
	
	

}
