package com.kodnest.empdemo.Service;

import com.kodnest.empdemo.Entity.Employee;
import com.kodnest.empdemo.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    EmpRepository empRepo;

    public List<Employee> getAllEmployees(){
        return empRepo.findAll(); // its return type is List because it will return list of employees
    }

    public Employee getEmployeeById(int id){
        return empRepo.findById(id).orElse(null);
    }

    public void insertEmployee(Employee e){
        empRepo.save(e);
    }

    public Employee updateEmployeeById(int id, Employee e){
        Employee emp = empRepo.findById(id).orElse(null);
        emp.setName(e.getName());
        emp.setSalary(e.getSalary());
        empRepo.save(emp);

        return emp;
    }

    public void deleteEmployeeById(int id){
        empRepo.deleteById(id); // it will not return anything if id found it will delete
        // if not then it will just ignore it
    }
}



















