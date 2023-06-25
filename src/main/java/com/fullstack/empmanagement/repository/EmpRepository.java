package com.fullstack.empmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.empmanagement.model.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
