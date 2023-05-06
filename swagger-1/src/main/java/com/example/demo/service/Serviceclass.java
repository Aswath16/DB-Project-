package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.food;
import com.example.demo.repository.repository1;
import com.example.demo.repository.repository2;

@Service
public class Serviceclass {
    @Autowired
    repository1 foodrep;
    @Autowired
    repository2 rep;
	public List<food> getall1() {
		return foodrep.findAll();	
	}
	public food addall(food fo) {
		return foodrep.save(fo);	
	}
	public void deletefood(int id) {
		
		 foodrep.deleteById(id);
	}
	public food savefood(food ice) {
		return foodrep.save(ice);
	}
	 public List<food> queryCarsFuel(String foodname)
		{
			return foodrep.getFood(foodname);
		}
	   
}
