package com.example.demo.carService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.carRepository.CarRepository;
import com.example.demo.carModel.CarModel;

@Service
public class CarService {
	@Autowired
	CarRepository carRepository;

	public List<CarModel>getAlldetails()
	{
		List<CarModel>List=carRepository.findAll();
		return List;
	}

	public CarModel savecar(CarModel s) {
		
		CarModel obj=carRepository.save(s);
		return obj;
	}
	public CarModel updatecar(CarModel s) {
		
		CarModel obj=carRepository.save(s);
		
		
		return obj;
	}
	public void deletecar(int register)
	{
		carRepository.deleteById(register);
	}
	public CarModel getcar(int register) {
		CarModel s=carRepository.findById(register).get();
		return s;
		
	}
	}
