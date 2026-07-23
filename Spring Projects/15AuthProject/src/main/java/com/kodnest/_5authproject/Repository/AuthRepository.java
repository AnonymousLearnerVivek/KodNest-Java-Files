package com.kodnest._5authproject.Repository;

import com.kodnest._5authproject.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Users, Integer> {

    public Users findByName(String name);

}
