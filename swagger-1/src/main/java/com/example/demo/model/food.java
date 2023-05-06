package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class food {
	@Id
	@GeneratedValue
	private int id ;
	private String foodname;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn
	 public List<fooddetails> modelfood;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public List<fooddetails> getModelfood() {
		return modelfood;
	}
	public void setModelfood(List<fooddetails> modelfood) {
		this.modelfood = modelfood;
	}
	

}
