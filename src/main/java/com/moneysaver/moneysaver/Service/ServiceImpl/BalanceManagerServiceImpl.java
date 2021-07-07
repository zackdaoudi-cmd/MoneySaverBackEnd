package com.moneysaver.moneysaver.Service.ServiceImpl;

import com.moneysaver.moneysaver.DAO.BalanceManager;
import com.moneysaver.moneysaver.DAO.Users;
import com.moneysaver.moneysaver.DTO.BalanceManagerDTO;
import com.moneysaver.moneysaver.DTO.Mapping.Converter.BalanceManagerConverter;
import com.moneysaver.moneysaver.Repository.BalanceManagerRepository;
import com.moneysaver.moneysaver.Service.IService.IBalanceManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BalanceManagerServiceImpl implements IBalanceManagerImpl {

    @Autowired
    private BalanceManagerConverter balanceManagerConverter;

    @Autowired
    private BalanceManagerRepository balanceManagerRepository;


    @Override
    public BalanceManagerDTO saveBAlanceManager(BalanceManagerDTO balanceManagerDTO){
        BalanceManager balanceManager = balanceManagerConverter.convertToEntity(balanceManagerDTO);
        balanceManager = balanceManagerRepository.save(balanceManager);
        return balanceManagerConverter.convertToDTO(balanceManager);
    }

    @Override
    public List<BalanceManagerDTO> getBalanceManagerByType(String type,Long idBalanceManager){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Users jwtUser = (Users) auth.getPrincipal();
        return balanceManagerConverter.convertToListDTO(balanceManagerRepository.findAllBalanceManagerByType(type,jwtUser.getIdUser(),idBalanceManager));
    }

    @Override
    public void DeleteBalanceManager(Long id){
        balanceManagerRepository.deleteById(id);
    }
}
