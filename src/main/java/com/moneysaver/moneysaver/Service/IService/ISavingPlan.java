package com.moneysaver.moneysaver.Service.IService;

import com.moneysaver.moneysaver.DTO.SavingPlanDTO;
import com.moneysaver.moneysaver.DTO.UserDTO;

public interface ISavingPlan {
    UserDTO getUser();

    SavingPlanDTO save(SavingPlanDTO dto);

    public SavingPlanDTO SavingPlanDTOById(Long id) ;

}