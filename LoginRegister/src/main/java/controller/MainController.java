package controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Signin;
import model.Signup;
import service.Signinimpl;
import service.Signupimpl;

@RestController
@RequestMapping("/home")
public class MainController {
	
	@Autowired Signinimpl inimpl;
	@Autowired Signupimpl upimpl;
	
     // Postman Authorization -->select Basic Authorization --> user=user , password=1212
	
	//   you can change the user and password in application.properties 
	
	//1.Signup
	
	@GetMapping("/signup")
	public String add(@RequestBody Signup up)
	{
		return upimpl.adddata(up);
	}
	
	//2. Signin
	
	@GetMapping("/signin")
	public String adddata(@RequestBody Signin in)
	{
		return inimpl.add(in);
	}
	
	

}
