package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Signin {
	@Id   @GeneratedValue
	private int id;
	
	private String password;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Signin(String password, String email) {
		super();
		this.password = password;
		this.email = email;
	}
	public Signin()
	{
		
	}
	@Override
	public String toString() {
		return "Signin [id=" + id + ", password=" + password + ", email=" + email + "]";
	}
    
}
