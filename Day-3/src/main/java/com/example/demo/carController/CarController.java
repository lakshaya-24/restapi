package com.example.demo.carController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.carModel.CarModel;
import com.example.demo.carService.CarService;

@RestController
public class CarController {
	@Autowired
	CarService Service;
@GetMapping("/getdata")
public List<CarModel> getAll()
{
	List<CarModel>cList=Service.getAlldetails();
	return cList;
}
//http://localhost:9080/saveStudent
	
@PostMapping("/post")
public CarModel save(@RequestBody CarModel s)
{
	return Service.savecar(s);
}
@PutMapping(value="/updatecar")
public CarModel updatecar(@RequestBody CarModel s,@RequestParam int id)
{
	s.setPid(id);
	return Service.savecar(s);
}
//http://localhost:9080/deletecar/563
@DeleteMapping(value="/deletecar")
public String deletecar(@RequestParam int id)
{
	 Service.deletecar(id);
	 return "Deleted Successfully";
}
@GetMapping(value="/getcar/{register}")
public CarModel getcar(@PathVariable("register")  int register)
{
	return Service.getcar(register);
}
	
	
	
	
	
	
}
