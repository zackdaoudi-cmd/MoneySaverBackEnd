package com.moneysaver.moneysaver.Configuration.Security;

import com.moneysaver.moneysaver.DAO.Users;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("GetUser")
public class UserController {

    //bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ6YWNrIiwiZXhwIjoxNjIzNzAyMTcxfQ.sUUHBDtsUYwhZx7fTvmCcZNEfQNT62c3BVPYLSPVckE
    @GetMapping("/name")
    public String  getUser(Authentication authentication){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("--------------------------------------------------------------");
        Users jwtUser = (Users) auth.getPrincipal();

        //Get the username of the logged in user: getPrincipal()
        System.out.println("get email =>"+jwtUser.getUsername());
        //Get the password of the authenticated user: getCredentials()
        System.out.println("(id : )=>"+jwtUser.getIdUser());
        return jwtUser.getIdUser() + "   " + jwtUser.getUsername();
    }
    @GetMapping("/names")
    public String  getUserse(){
        return "jwtUser.getIdUser() ";
    }

    @GetMapping("/namess")
    public Users getUserw(Authentication authentication){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("--------------------------------------------------------------");
        Users jwtUser = (Users) auth.getPrincipal();
        Users u = new Users();
        u.setIdUser(jwtUser.getIdUser());
        u.setUsername(jwtUser.getUsername());
        u.setSavingPlants(jwtUser.getSavingPlants());
        return u;
    }


}
