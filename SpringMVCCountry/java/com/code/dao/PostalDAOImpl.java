package com.code.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.code.model.Postal;

@Service
public class PostalDAOImpl implements PostalDAO{

	
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	@Override
	public void insertCountryCode(Postal postal) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(postal);
		System.out.println("Saved Successfully");
		
	}

	@Override
	public String displayCode(String country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editCode(Postal postal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCountry(String country) {
		// TODO Auto-generated method stub
		
	}

}
