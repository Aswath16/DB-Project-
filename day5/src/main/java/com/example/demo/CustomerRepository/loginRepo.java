package com.example.demo.CustomerRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Customer.login;
@Repository
public interface loginRepo extends JpaRepository<login, Integer>{

	login findByuname(String uname);



}
