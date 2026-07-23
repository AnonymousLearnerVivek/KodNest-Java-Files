package com.kodnest._5authproject.Service;

import com.kodnest._5authproject.Entity.Users;
import com.kodnest._5authproject.Repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    AuthRepository authRepo;

    public String verify(String username, String password) {
        Users byName = authRepo.findByName(username);
        if(byName != null){
            if (password.equals(byName.getPassword())) {
                switch (byName.getRole()) {
                    case "Admin":
                        return "Welcome Admin";
                    case "User":
                        return "Welcome User";
                }
            } else  {
                return "Wrong password";
            }
        }
        return "User not found";
    }
}