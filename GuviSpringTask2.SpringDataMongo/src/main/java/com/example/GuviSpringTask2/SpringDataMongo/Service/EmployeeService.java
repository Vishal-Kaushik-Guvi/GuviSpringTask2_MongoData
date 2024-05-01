package com.example.GuviSpringTask2.SpringDataMongo.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GuviSpringTask2.SpringDataMongo.Entities.Employee;
import com.example.GuviSpringTask2.SpringDataMongo.Repository.EmployeeRepo;

@Service
public class EmployeeService {

  @Autowired
  private EmployeeRepo empRepo;

  public Employee addEmployee(Employee emp) {
    emp.setId(UUID.randomUUID().toString().split("-")[0]);
    return empRepo.save(emp);
  }

  public List<Employee> displayAllEmployee() {
    return empRepo.findAll();
  }

  public Employee displayById(String id) {
    return empRepo.findById(id).get();
  }
}
