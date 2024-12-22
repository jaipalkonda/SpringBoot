package com.nit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.nit.Entity.Employee;

@Repository("repos")
public interface IRepositoriesLog extends JpaRepository<Employee, Integer> {

}
