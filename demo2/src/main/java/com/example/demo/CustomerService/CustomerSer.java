package com.example.demo.CustomerService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.Customer.CustomerDetails;
import com.example.demo.CustomerRepository.CustomerRepo;
@Service
public class CustomerSer {
	@Autowired
	CustomerRepo repobj;
	private CrudRepository<CustomerDetails, Integer> repository;
	
	public String addCustomer(CustomerDetails pojobj)
	{
		repobj.save(pojobj);
	return"Added";
	}
	
	public List<CustomerDetails>getCustomer()
	{
		return repobj.findAll();
	}
	
	public Optional<CustomerDetails>getCustomerById(int id)
	{
		return repobj.findById(id);
	}
	public String getSave(CustomerDetails pojobj)
	{
		repobj.save(pojobj);
		return "Updated";
	}
	public void deleteByRequestParam(int id)
	{
		repobj.deleteById(id);
	}

}