package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Signin;
import model.Signup;
import repository.Signinrepo;
import repository.Signuprepo;

@Service
public class Signinimpl implements Signinservice {
  @Autowired Signinrepo inrepo;
  @Autowired Signuprepo uprepo;
	@Override
	public String add(Signin in) 
	{
		String n="";
		for(Signup x:uprepo.findAll())
		{
			
			if(in.getEmail().equals(x.getEmailid()) && in.getPassword().equals(x.getPassword()) )
			{
				inrepo.save(in);
				n= "Login successfull";
			}
			else
			{
				n="you are not registered before, Please register in signup page";
				
			}
		}
		return n;	
		
	}

}
