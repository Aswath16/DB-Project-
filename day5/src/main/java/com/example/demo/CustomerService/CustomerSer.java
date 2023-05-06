package com.example.demo.CustomerService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Customer.CustomerDetails;
import com.example.demo.Customer.login;
import com.example.demo.CustomerRepository.CustomerREpo;
import com.example.demo.CustomerRepository.loginRepo;

@Service
public class CustomerSer {
	@Autowired
	CustomerREpo repobj;
	
	@Autowired
	loginRepo repo;
	
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

	//Sorting
	public List<CustomerDetails> getProductDetails(String field) {
		// TODO Auto-generated method stub
		return repobj.findAll(Sort.by(Sort.Direction.DESC, field));
	}
	

	//pagination
	public List<CustomerDetails> getProductwithpaging(int offset, int pagesize) {
		// TODO Auto-generated method stub
		Page<CustomerDetails> pojobj=repobj.findAll(PageRequest.of(offset,pagesize));
		return pojobj.getContent();
	}
	
	//Pagination and Sorting
		public List<CustomerDetails> getProduct(int offset, int pagesize, String field) {
			// TODO Auto-generated method stub
			PageRequest paging = PageRequest.of(offset,pagesize,Sort.by(field));
			Page<CustomerDetails> pojobj = repobj.findAll(paging);
			return pojobj.getContent() ;
		}
		
		public String checkLogin(String uname,String pwd)
		{
			login user=repo.findByuname(uname);
			if(user==null)
			{
				return "Invalid Details";
			}
			else
			{
				if(user.getPwd().equals(pwd))
				{
					return "Login successful";
				}
				else
				{
					return "Login failed";
				}
			}
		}
		
		public login addUser(login mod)
		{
			return repo.save(mod);
		}
		
		
		public List<login> getUser()
		{
			return repo.findAll();
		}


}
