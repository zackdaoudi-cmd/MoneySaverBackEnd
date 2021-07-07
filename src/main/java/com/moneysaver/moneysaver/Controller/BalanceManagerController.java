package com.moneysaver.moneysaver.Controller;

import com.moneysaver.moneysaver.DTO.BalanceManagerDTO;
import com.moneysaver.moneysaver.Service.IService.IBalanceManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/BalanceManager/")
public class BalanceManagerController {

    @Autowired
    private IBalanceManagerImpl balanceManager;

    @PostMapping("newBalanceManager/")
    public void saveNewBalanceManager(@RequestBody BalanceManagerDTO balanceManagerDTO){
        balanceManager.saveBAlanceManager(balanceManagerDTO);
    }

    @GetMapping("ListBalanceManagerByType/{type}/{id}")
    public List<BalanceManagerDTO> ListBalanceManagerByType(@PathVariable String type,@PathVariable Long id){
        return balanceManager.getBalanceManagerByType(type,id);
    }

    @DeleteMapping("deleteBalanceManagerById/{id}")
    public void DeleteBalanceManagerById(@PathVariable Long id){
        balanceManager.DeleteBalanceManager(id);
    }
}
