package com.example.Spring_customise_security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @GetMapping("/balance")
    public ResponseEntity<String> getBalance() {
        return ResponseEntity.ok("Your balance is 500000000");
    }

    @GetMapping("/transfer")
    public String transfer(){
        return "Transfered balance successfully";
    }

    @GetMapping("/login")
    public String login(){
        return "Login successfully !!";
    }

    @GetMapping("/contact")
    public String getDetails(){
        return "Our contact details are 1234567890";
    }

}