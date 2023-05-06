package com.example.demo.CustomerRepository;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Customer.CustomerDetails;

@Repository
public interface CustomerREpo extends JpaRepository<CustomerDetails, Integer>{

//public Optional<CustomerDetails>findById(name)

	

	

}
