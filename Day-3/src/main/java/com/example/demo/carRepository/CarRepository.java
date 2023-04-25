package com.example.demo.carRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.carModel.CarModel;

public interface CarRepository extends JpaRepository<CarModel, Integer> {

}





