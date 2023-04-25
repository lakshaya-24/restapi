package com.example.day2.task1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ClassEx1 {
   @GetMapping("/hi")

   public String display() {
	   return "Welcome to RestAPI";
   }
}
