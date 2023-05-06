package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class fooddetails {
   @Id
   private int id;
   private String foodvariant;
   private int Quantity;
   private int price;
  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFoodvariant() {
	return foodvariant;
}
public void setFoodvariant(String foodvariant) {
	this.foodvariant = foodvariant;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
}
