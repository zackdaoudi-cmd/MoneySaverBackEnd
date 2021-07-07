package com.moneysaver.moneysaver.Controller;


import com.moneysaver.moneysaver.DAO.SavingPlan;
import com.moneysaver.moneysaver.DAO.Users;
import com.moneysaver.moneysaver.DTO.SavingPlanDTO;
import com.moneysaver.moneysaver.DTO.UserDTO;
import com.moneysaver.moneysaver.Repository.SavingPlanRepository;
import com.moneysaver.moneysaver.Repository.UserRepository;
import com.moneysaver.moneysaver.Service.ServiceImpl.SavingPlanImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;


@RestController
@RequestMapping("SavingPlan")
public class SavingPlanController {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private SavingPlanImpl savingPlan;

    @GetMapping("UserSp")
    public UserDTO UserSavingPlan(){
       return savingPlan.getUser();
    }

    @PostMapping("addNewSp/")
    public void saveNewSavingPlan(@RequestBody SavingPlanDTO savingPlanDTO){

            if(savingPlanDTO != null ){
                savingPlan.save(savingPlanDTO);
            }

    }

    @GetMapping("SavingPlan/{id}")
    public SavingPlanDTO getSavingPlan(@PathVariable Long id){
        return savingPlan.SavingPlanDTOById(id);
    }

}
