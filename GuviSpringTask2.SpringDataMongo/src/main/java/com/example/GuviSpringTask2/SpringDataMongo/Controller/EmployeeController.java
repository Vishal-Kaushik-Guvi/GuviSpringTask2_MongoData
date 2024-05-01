package com.example.GuviSpringTask2.SpringDataMongo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GuviSpringTask2.SpringDataMongo.Entities.Employee;
import com.example.GuviSpringTask2.SpringDataMongo.Service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

    @PostMapping("/index")
    public String addEmployeeData(@RequestBody Employee emp) {
         empService.addEmployee(emp);
         return "Employee Added";
    }

    @GetMapping("/displayall")
    public List<Employee> findAllEmployee(Employee emp) {
      return empService.displayAllEmployee();
    }

    @GetMapping("/display/{id}")
    public Employee findEmployeeById(@PathVariable String id) {
        return empService.displayById(id);
    }
}