package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.empdao.EmpDao;
import com.example.demo.employee.Employee;


@Controller
public class EmpController 
{
	@Autowired
	EmpDao dao;
	

	@RequestMapping("/")
	public String loginPage()
	{
		return "login.html";
		
	}
	
	
	@RequestMapping("/home")
	public String homePage()
	{
		return "home.html";
		
	}
	
	@RequestMapping("/insertemp")
	public String insertEmployee(Employee e)
	{
		if(dao.existsById(e.getEid()))
			System.out.println("sorry already employee exixts with:"+e.getEid());
		else
		    dao.save(e);
		return "home.html";
	}
	
	
	@RequestMapping("/displayemp")
	@ResponseBody
	public List<Employee> showEmployee()
	{
		return dao.findAll();
	}
	
	@RequestMapping("/updatemp")
	public String updateEmployee(Employee e)
	{
		if(dao.existsById(e.getEid()))
			dao.save(e);
		else
			System.out.println("no fields exists with:"+e.getEid());
		return "welcome.html";
	}
	
}
