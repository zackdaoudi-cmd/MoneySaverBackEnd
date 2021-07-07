package com.moneysaver.moneysaver.Service.ServiceImpl;

import com.moneysaver.moneysaver.DAO.SavingPlan;
import com.moneysaver.moneysaver.DAO.Users;
import com.moneysaver.moneysaver.DTO.Mapping.Converter.SavingPlanConverter;
import com.moneysaver.moneysaver.DTO.Mapping.Converter.UsersDtoConverter;
import com.moneysaver.moneysaver.DTO.SavingPlanDTO;
import com.moneysaver.moneysaver.DTO.UserDTO;
import com.moneysaver.moneysaver.Repository.SavingPlanRepository;
import com.moneysaver.moneysaver.Repository.UserRepository;
import com.moneysaver.moneysaver.Service.IService.ISavingPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SavingPlanImpl implements ISavingPlan {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UsersDtoConverter usersDtoConverter;

    @Autowired
    private SavingPlanRepository savingPlanRepository;

    @Autowired
    private SavingPlanConverter savingPlanConverter;


    @Override
    public UserDTO getUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Users users = (Users) auth.getPrincipal();
        Optional<Users> usersOptional = userRepository.findById(users.getIdUser());
        UserDTO userDTO = usersDtoConverter.convertToDTO(usersOptional.get());
        return userDTO;
    }

    @Override
    public SavingPlanDTO save(SavingPlanDTO savingPlanDTO){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Users users = (Users) auth.getPrincipal();
        SavingPlan savingPlan = savingPlanConverter.convertToEntity(savingPlanDTO);
        savingPlan.setUsers(users);
        savingPlan = savingPlanRepository.save(savingPlan);
        return savingPlanConverter.convertToDTO(savingPlan);
    }

    @Override
    public SavingPlanDTO SavingPlanDTOById(Long id) {
        Optional<SavingPlan> savingPlan = savingPlanRepository.findById(id);

        return savingPlanConverter.convertToDTO(savingPlan.get());
    }

}
