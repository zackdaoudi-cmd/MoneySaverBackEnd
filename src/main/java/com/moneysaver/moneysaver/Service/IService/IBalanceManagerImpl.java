package com.moneysaver.moneysaver.Service.IService;

import com.moneysaver.moneysaver.DTO.BalanceManagerDTO;

import java.util.List;

public interface IBalanceManagerImpl {

    BalanceManagerDTO saveBAlanceManager(BalanceManagerDTO balanceManagerDTO);

    List<BalanceManagerDTO> getBalanceManagerByType(String type,Long idBalanceManager);

    void DeleteBalanceManager(Long id);
}
