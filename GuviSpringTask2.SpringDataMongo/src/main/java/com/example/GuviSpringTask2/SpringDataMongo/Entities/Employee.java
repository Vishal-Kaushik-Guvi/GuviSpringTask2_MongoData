package com.example.GuviSpringTask2.SpringDataMongo.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

@Document
@Data
@ToString
public class Employee {
    private String name;
    private String email;
    private String location;
    @Id
    private String id;
}
