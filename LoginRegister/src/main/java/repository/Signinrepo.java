package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Signin;

public interface Signinrepo extends JpaRepository<Signin,Integer>{

}
