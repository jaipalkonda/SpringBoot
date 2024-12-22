package com.nit.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Entity.Employee;
import com.nit.repositories.IRepositoriesLog;

@Service("Servlog")
public class ServiceLogics implements IServiceLogs {

	@Autowired
	private IRepositoriesLog repo;

	@Override
	public List<Employee> showDetailsEmp() {
		
			List<Employee> employees = repo.findAll();
			
			//sort
			employees.sort((emp1,emp2)->(emp1.getEmpno().compareTo(emp2.getEmpno())));
			
			//return logic
			return employees;
		}
	}
	



