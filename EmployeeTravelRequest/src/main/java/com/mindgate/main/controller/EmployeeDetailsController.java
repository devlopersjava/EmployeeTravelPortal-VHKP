package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.pojo.EmployeeDetails;
import com.mindgate.main.service.EmployeeDetailsServiceInterface;

@RestController
@RequestMapping("employeeDetails")
public class EmployeeDetailsController
{
	@Autowired
	EmployeeDetailsServiceInterface employeeDetailsService; 
	
//	@RequestMapping(value="employee", method=RequestMethod.POST)
//	public @ResponseBody boolean addNewEmployee(@RequestBody EmployeeDetails employeeDetails)
//	{
//		return employeeDetailsService.addNewEmployee(employeeDetails);
//	}
//	
//
//	@RequestMapping(value="employee", method=RequestMethod.PUT)
//	public @ResponseBody boolean updateEmployeeDetails(@RequestBody EmployeeDetails employeeDetails)
//	{
//		return employeeDetailsService.updateEmployeeDetails(employeeDetails);
//	}
//
//	@RequestMapping(value="employee/{id}", method=RequestMethod.DELETE)
//	public @ResponseBody boolean deleteEmployeeByEmployeeId(@PathVariable("id") int employeeId)
//	{
//		return employeeDetailsService.deleteEmployeeByEmployeeId(employeeId);
//	}

	@RequestMapping(value="employee/{id}", method=RequestMethod.GET)
	public EmployeeDetails getEmployeeByEmployeeId(@PathVariable("id") int employeeId) 
	{
	    return employeeDetailsService.getEmployeeByEmployeeId(employeeId);
	}

	@RequestMapping(value="employee", method=RequestMethod.GET)
	public List<EmployeeDetails> getAllEmployees()
	{
		return employeeDetailsService.getAllEmployees();
	}
}
