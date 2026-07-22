package com.kodnest.empdemo.Controller;

import com.kodnest.empdemo.Entity.Employee;
import com.kodnest.empdemo.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    EmpService empService;

    // Fetching all the employees
    @GetMapping("/getallemp")
    public List<Employee> getAllEmployees(){
        return empService.getAllEmployees();
    }

    // Fetching employee by its id
    @GetMapping("/getemp/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return empService.getEmployeeById(id);
    }

    // Insert Employee to the table
    @PostMapping("/insertEmployee")
    public void insertEmployee(@RequestBody Employee e){
        empService.insertEmployee(e);
    }

    // Updating employee
    @PutMapping("/updateemp/{id}")
    public Employee updateEmployeeById(@PathVariable int id, @RequestBody Employee e){
        return empService.updateEmployeeById(id, e);
    }

    // Delete Employee by id
    @DeleteMapping("/deleteemp/{id}")
    public void deleteEmployeeById(@PathVariable int id){
        empService.deleteEmployeeById(id);
    }
}




















