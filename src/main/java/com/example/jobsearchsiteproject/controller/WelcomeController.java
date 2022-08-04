package com.example.jobsearchsiteproject.controller;

import com.example.jobsearchsiteproject.model.response.ResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public ResponseEntity welcomeMessageApi() {
        String welcomeMsg = "Welcome to Job Search Application -- Good luck :)";
        ResponseModel responseModel = new ResponseModel();
        responseModel.setWelcomeMessage(welcomeMsg);
        return ResponseEntity.status(200).body(responseModel);
    }
}
