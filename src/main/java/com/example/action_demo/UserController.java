package com.example.action_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    

    // Get all users
    @GetMapping
    public String getAllUsers() {
        return "hello world";
    }

    
}