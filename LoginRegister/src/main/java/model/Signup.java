package model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Signup {
	@Id   @GeneratedValue
	private int id;
	private String name;
	private String emailid;
	private String password;
	private String mobileno;
	private Date datetime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	
	public Signup(String name, String emailid, String password, String mobileno, Date datetime) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.password = password;
		this.mobileno = mobileno;
		this.datetime = datetime;
	}
	
	@Override
	public String toString() {
		return "Signup [id=" + id + ", name=" + name + ", emailid=" + emailid + ", password=" + password + ", mobileno="
				+ mobileno + ", datetime=" + datetime + "]";
	}
	
	public Signup()
	{
		
	}

}
