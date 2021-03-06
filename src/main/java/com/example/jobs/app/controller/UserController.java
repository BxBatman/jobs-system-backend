package com.example.jobs.app.controller;

import com.example.jobs.app.model.dto.UserDto;
import com.example.jobs.app.service.UserAccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {

    private UserAccountService userAccountService;

    public UserController(UserAccountService userAccountService) {
        this.userAccountService = userAccountService;
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody UserDto userDto){
        userAccountService.saveUser(userDto);
    }

}
