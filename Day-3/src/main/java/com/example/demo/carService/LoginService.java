package com.example.demo.carService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.carModel.LoginModel;
import com.example.demo.carRepository.LoginRepository;

	@Service
	public class LoginService {
		@Autowired
		  public LoginRepository obj;
			public String checkLogin(String username,String password)
			{
			LoginModel user= obj.findByusername(username);
			if(user==null)
			{
				return "No user found";
			}
			else
			{
				if(user.getPassword().equals(password))
				{
					return "Login Succesful";
				}
				else
				{
					return "Login Failed";
				}
			}
			
		} 
			
			public List<LoginModel> getUser()
			{
				return obj.findAll();
			}
			
		
		public LoginModel addUser(LoginModel cl)
		{
			return obj.save(cl);
		}
		
		
	}


