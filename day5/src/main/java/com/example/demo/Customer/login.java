package com.example.demo.Customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class login {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String uname;
private String pwd;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}





}
