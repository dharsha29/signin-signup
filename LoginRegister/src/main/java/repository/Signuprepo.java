package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Signup;

public interface Signuprepo extends JpaRepository<Signup,Integer>{

}
