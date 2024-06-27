package com.samanecorp.resteasymaven.rs.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "userDto")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserDto {

	@XmlElement(name = "idUser")
	private int id;
	@XmlElement(name = "emailUser")
	private String email;
	@XmlElement(name = "pwdUser")
	private String password;
	
	public UserDto() {
		
	}
	
	public UserDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
