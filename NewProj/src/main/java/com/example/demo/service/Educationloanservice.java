package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AdminModel;
import com.example.demo.model.LoginApplicationModel;
import com.example.demo.model.LoginModel;
import com.example.demo.model.UserModel;
import com.example.demo.repository.AdminRepo;
import com.example.demo.repository.LoanApplicationRepo;
import com.example.demo.repository.LoginRepo;
import com.example.demo.repository.UserRepo;

@Service
public class Educationloanservice {

	@Autowired
	
	//post

     public AdminRepo arepo;
	@Autowired
     public LoanApplicationRepo loanrepo;
	@Autowired
     public LoginRepo lrepo;
	@Autowired
     public UserRepo urepo;
     
    //AdminModel
     public AdminModel post1(AdminModel amodel)
     {
    	 return arepo.save(amodel);
     }
     
     public List<AdminModel> get1()
     {
    	 return arepo.findAll();
     }
     
     public AdminModel put1(AdminModel amodel1)
     {
    	 return arepo.saveAndFlush(amodel1);
     }
     
     public void delete1(String Password)
     {
    	 arepo.deleteAll();;
     }
     
     //LoanApplicationModel
     public LoginApplicationModel post2(LoginApplicationModel amodel2)
     {
    	 return loanrepo.save(amodel2);
     }
     
     public List<LoginApplicationModel> get2()
     {
    	 return loanrepo.findAll();
     }
     
     public LoginApplicationModel put2(LoginApplicationModel amodel3)
     {
    	 return loanrepo.saveAndFlush(amodel3);
     }
     
     public void delete2(int loanid)
     {
    	 loanrepo.deleteById(loanid);
     }
     
     //LoginModel
     public LoginModel post3(LoginModel amodel4)
     {
    	 return lrepo.save(amodel4);
     }
     
     public List<LoginModel> get3()
     {
    	 return lrepo.findAll();
     }
     
     public LoginModel put3(LoginModel amodel5)
     {
    	 return lrepo.saveAndFlush(amodel5);
     }
     
     public void delete3(String Password)
     {
    	  lrepo.deleteAll();
     }
     
     //UserModel
     
     public UserModel post4(UserModel amodel6)
     {
    	 return urepo.save(amodel6);
     }
     
     public List<UserModel> get4()
     {
    	 return urepo.findAll();
     }
     
     public UserModel put4(UserModel amodel7)
     {
    	 return urepo.saveAndFlush(amodel7);
     }
     
     public void delete4(int id)
     {
    	 urepo.deleteById(id);
     }
}
