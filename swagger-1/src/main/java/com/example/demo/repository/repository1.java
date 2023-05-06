package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.food;

public interface repository1 extends JpaRepository<food, Integer> {
	//positional parameter
	@Query("select s from food s where s.foodname=?1")
	public List<food> getFood(String foodname);
	
	//naming parameter
	@Query("select s from food s where s.foodname=:foodnames")
	List<food> getfoodname(String foodname);
}