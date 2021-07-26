package com.example.demo;

import com.example.demo.MyName;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {

	private static final String template = "Hello, %s!";
	
	
	@GetMapping("/greeting")
    public MyName myName(@RequestParam(value = "name" , defaultValue = "World") String name) {
    	return new MyName(String.format(template, name));
    }
}