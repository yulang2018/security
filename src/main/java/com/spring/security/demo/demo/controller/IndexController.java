package com.spring.security.demo.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/role")
    public String role(){
        return "role";
    }

}
