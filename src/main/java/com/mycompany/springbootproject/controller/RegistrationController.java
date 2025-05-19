package com.mycompany.springbootproject.controller;

import com.mycompany.springbootproject.entity.UserAuthEntity;
import com.mycompany.springbootproject.service.UserAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")
public class RegistrationController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserAuthenticationService userAuthenticationService;

    @PostMapping("/register")
    public String Register(@RequestBody UserAuthEntity user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userAuthenticationService.save(user);
        return "Register successful";
    }

    @GetMapping("/user")
    public String getUser() {

        return "getUser successful";
    }
}
