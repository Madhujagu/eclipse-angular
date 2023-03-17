package com.sign.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Signup 
{
	@Id
	@GeneratedValue
	private int id;
	private String useremail;
	private String phonenumer;
	private String password;
	
	public Signup() {
		super();
	}

	public Signup(String useremail, String phonenumer, String password) {
		super();
		this.useremail = useremail;
		this.phonenumer = phonenumer;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getPhonenumer() {
		return phonenumer;
	}

	public void setPhonenumer(String phonenumer) {
		this.phonenumer = phonenumer;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Signup [id=" + id + ", useremail=" + useremail + ", phonenumer=" + phonenumer + ", password=" + password
				+ "]";
	}
	
	
	
	

}
