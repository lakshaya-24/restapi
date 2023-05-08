package com.example.demo.carRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.carModel.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel, Integer> {

	//LoginRepo1    package com.example.demo.Repo;

		LoginModel findByusername(String username);
}
