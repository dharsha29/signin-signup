package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Signup;
import repository.Signinrepo;
import repository.Signuprepo;

@Service
public class Signupimpl implements Signupservice {
@Autowired Signuprepo uprepo;
@Autowired Signinrepo inrepo;
	@Override
	public String adddata(Signup up) {
		
		uprepo.save(up);
	    return "Registered successfully";
	}

}
