package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {

	 @RequestMapping("/fizzbuzz")
	    public String fizzBuzz() {
	        return FizzBuzz.getOutput().toString();
	    }
}
