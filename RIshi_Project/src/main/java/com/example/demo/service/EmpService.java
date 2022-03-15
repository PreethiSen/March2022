package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmpRepositoryInt;

@Service
public class EmpService {
	
	@Autowired
	EmpRepositoryInt emprepo;
	
	public  Employee saveEmp(Employee emp)
	{
		return emprepo.save(emp);
		
	}
	
	public Optional<Employee> getEmp(Long id)
	{
		return emprepo.findById(id);
	}
	
	public List<Employee> getAllEmp(){
		return emprepo.findAll();
	}

}
