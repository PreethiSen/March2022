package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmpService;


@RestController

public class ControllerClass {
	
	@Autowired
	EmpService empservice;

	@GetMapping("/")
	String display()
	{
		return "hello Rishi Project";
		
	}
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee emp)
	{
		System.out.println("New Employee saved");
		
		return empservice.saveEmp(emp);
	}
	
	
	@GetMapping("/id/{id}")
	public Optional<Employee> getEmpbyID(@PathVariable("id") Long id)
	{
		System.out.println(" Employee retrieved");
		return empservice.getEmp(id);
	}
	
	@GetMapping("/all")
	public Optional<List<Employee>> geAlltEmp()
	{
		System.out.println(" Alll Employee retrieved");
		return Optional.of(empservice.getAllEmp());
	}
	}
	

