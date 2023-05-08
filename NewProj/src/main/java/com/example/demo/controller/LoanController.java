package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AdminModel;
import com.example.demo.model.LoginApplicationModel;
import com.example.demo.model.LoginModel;
import com.example.demo.model.UserModel;
import com.example.demo.service.Educationloanservice;

@RestController
public class LoanController {

	@Autowired
    public Educationloanservice lser;
	  
	//AdminModel
	@PostMapping("/post1")
	public AdminModel postD(AdminModel amodel)
	{
		return lser.post1(amodel);
	}
	@GetMapping("/get1")
	public List<AdminModel> getD()
	{
		return lser.get1();
	}
	@PutMapping("/put1")
	public AdminModel putD(AdminModel amodel1)
	{
		return lser.put1(amodel1);
	}
	@DeleteMapping("/del1/{cpas}")
	public String deleteD(@PathVariable("cpas") String password)
	{
		lser.delete1(password);
		return "Deleted";
	}
	
	//LoanApplicationModel
	
	@PostMapping("/post2")
	public LoginApplicationModel postD1(LoginApplicationModel amodel3)
	{
		return lser.post2(amodel3);
	}
	@GetMapping("/get2")
	public List<LoginApplicationModel> getD1()
	{
		return lser.get2();
	}
	@PutMapping("/put2")
	public LoginApplicationModel putD1(LoginApplicationModel amodel4)
	{
		return lser.put2(amodel4);
	}
	@DeleteMapping("/del2/{cid}")
	public String deleteD1(@PathVariable("cid") int loanid)
	{
		lser.delete2(loanid);
		return "Deleted";
	}
	
	//LoginModel
	@PostMapping("/post3")
	public LoginModel postD2(LoginModel amodel5)
	{
		return lser.post3(amodel5);
	}
	@GetMapping("/get3")
	public List<LoginModel> getD2()
	{
		return lser.get3();
	}
	@PutMapping("/put3")
	public LoginModel putD2(LoginModel amodel6)
	{
		return lser.put3(amodel6);
	}
	@DeleteMapping("/del3/{apass}")
	public String deleteD2(@PathVariable ("apass")String password)
	{
		lser.delete3(password);
		return "Deleted";
	}
	
	//UserModel
	@PostMapping("/post4")
	public UserModel postD3( @RequestBody UserModel amodel7)
	{
		return lser.post4(amodel7);
	}
	@GetMapping("/get4")
	public List<UserModel> getD3()
	{
		return lser.get4();
	}
	@PutMapping("/put4")
	public UserModel putD3( @RequestBody UserModel amodel8)
	{
		return lser.put4(amodel8);
	}
	@DeleteMapping("/del4/{aid}")
	public String deleteD3(@PathVariable("aid") int id)
	{
		lser.delete4(id);
		return "Deleted";
	}
}
