package com.code.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POSTAL")
public class Postal {
	
	@Id
	@Column(name="country")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String country;
	
	@Column(name="code")
	private String code;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code2) {
		this.code = code2;
	}
	
}
