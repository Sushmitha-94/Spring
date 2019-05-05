package com.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.code.dao.PostalDAO;
import com.code.dao.PostalDAOImpl;
import com.code.model.Postal;

@Controller
public class helperClass {
	
	private PostalDAO post;
	
	@Autowired(required=true)
	public void setPostalDAOImpl(PostalDAOImpl post) {
		this.post=post;
	}
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public ModelAndView getCountry() {
		System.out.println("code controller");
		ModelAndView theModelView=new ModelAndView("getCode");
		return theModelView;
	}
	
	@RequestMapping(value= "/display", method = RequestMethod.POST)
	public ModelAndView sendCode(@ModelAttribute("country") String country,@ModelAttribute("code") String code) {
		System.out.println("Send code controller");
		Postal postal=new Postal();
		postal.setCode(code);
		postal.setCountry(country);	
		post.insertCountryCode(postal);
		
		ModelAndView theModelView=new ModelAndView("displayCode");
		theModelView.addObject("country", country);
		theModelView.addObject("code", code);
		return theModelView;
	}
}
