package com.moneysaver.moneysaver.Controller;

import com.moneysaver.moneysaver.DTO.UserRegisterDTO;
import com.moneysaver.moneysaver.Service.IService.IUserRegisterImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Users/")
public class UserRegisterController {

    @Autowired
    private IUserRegisterImpl iUserRegister;

    @PostMapping("Register/")
    public void Register(@RequestBody UserRegisterDTO userRegisterDTO){
        iUserRegister.saveNewUser(userRegisterDTO);
    }
}
