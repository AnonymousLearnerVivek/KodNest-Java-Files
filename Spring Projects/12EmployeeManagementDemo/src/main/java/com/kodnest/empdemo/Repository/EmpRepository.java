package com.kodnest.empdemo.Repository;

import com.kodnest.empdemo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository   // Because it will interact with the database
public interface EmpRepository extends JpaRepository<Employee, Integer>
{

}
