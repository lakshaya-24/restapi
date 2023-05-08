package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AdminModel {
  @Id
  private String Email;
  private String Password;
  private String Mobilenumber;
  private String Userrole;
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getMobilenumber() {
	return Mobilenumber;
}
public void setMobilenumber(String mobilenumber) {
	Mobilenumber = mobilenumber;
}
public String getUserrole() {
	return Userrole;
}
public void setUserrole(String userrole) {
	Userrole = userrole;
}
  
}
