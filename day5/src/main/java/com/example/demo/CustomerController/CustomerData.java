package com.example.demo.CustomerController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Customer.CustomerDetails;
import com.example.demo.Customer.login;
import com.example.demo.CustomerService.CustomerSer;



@RestController
public class CustomerData {
	@Autowired
	CustomerSer serobj;
	

	@PostMapping("/post")
	public String create(@RequestBody CustomerDetails pojobj )
	{
		return serobj.addCustomer(pojobj);
	}
	
	@GetMapping("/get")
	public List<CustomerDetails>read()
	{
		return serobj.getCustomer();
	}
	
	@GetMapping("/{id}")
	public Optional<CustomerDetails>readById(@PathVariable int id)
	{
		return serobj.getCustomerById(id);
	}
	
	@PutMapping("/{id}")
	public String update(@RequestBody CustomerDetails pojobj)
	{
		return serobj.getSave(pojobj);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam("cid") int id)
	{
		serobj.deleteByRequestParam(id);
		return "deleted";
	}
	
	//Sorting
		@GetMapping("/product/{field}")
		public List<CustomerDetails>getProductsSorted(@PathVariable String field)
		{
			return serobj.getProductDetails(field);
		}
		
	//pagination
		@GetMapping("/product/{offset}/{pagesize}")
		public List<CustomerDetails> getProductswithPagination(@PathVariable int offset, @PathVariable int pagesize)
		{
			return serobj.getProductwithpaging(offset, pagesize);
		}
		
	//pagination & Sorting
		@GetMapping("/product/{offset}/{pagesize}/{field}")
		public List<CustomerDetails> getProductwithpagingandSorting(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field)
		{
			return serobj.getProduct(offset,pagesize,field);
		}
		
		
		@PostMapping("/pomL")
		public String login(@RequestBody Map<String ,String> loginData)
		
		{
			String uname=loginData.get("uname");
			String pwd=loginData.get("pwd");
			String result=serobj.checkLogin(uname,pwd);
			return result;
	    }
		
		
		@PostMapping("/addL")
		public login AddUser(@RequestBody login mod)
		{
			return serobj.addUser(mod);
		}
		
		
		@GetMapping("/c")
		public List<login> listAll()
		{
			return serobj.getUser();
		}
		}
