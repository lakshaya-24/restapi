package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LoginApplicationModel;

public interface LoanApplicationRepo extends JpaRepository<LoginApplicationModel, Integer> {

}
