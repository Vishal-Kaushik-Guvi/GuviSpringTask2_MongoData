package com.example.GuviSpringTask2.SpringDataMongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.GuviSpringTask2.SpringDataMongo.Entities.Employee;

public interface EmployeeRepo extends MongoRepository<Employee,String>{

}
