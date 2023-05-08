package com.example.demo.carController;
	//LoginController    package com.example.demo.Controller;
	import java.util.List;
	import java.util.Map;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.example.demo.carModel.LoginModel;
import com.example.demo.carService.LoginService;
	@RestController
	@RequestMapping("/user")
	public class LoginController {
		
		@Autowired
		private LoginService lser;
		//To log in:
		@PostMapping("/login")
		public String login(@RequestBody Map<String,String>loginData)
		{
			String username=loginData.get("username");
			String password=loginData.get("password");
			String result=lser.checkLogin(username,password);
			return result;
		}
		//To add users
		@PostMapping("/add")
		public LoginModel AddUser(@RequestBody LoginModel cl)
		{
			return lser.addUser(cl);
		}

		@GetMapping("/get")
		public List<LoginModel> listAll()
		{	
			return lser.getUser();
		}
		


	}


