package com.code.dao;

import com.code.model.Postal;

public interface PostalDAO {
	
	public void insertCountryCode(Postal postal);
	public String displayCode(String country);
	public void editCode(Postal postal);
	public void deleteCountry(String country);
	
}
