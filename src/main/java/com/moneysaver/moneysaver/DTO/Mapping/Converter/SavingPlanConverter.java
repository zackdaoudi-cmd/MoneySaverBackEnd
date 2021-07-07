package com.moneysaver.moneysaver.DTO.Mapping.Converter;

import com.moneysaver.moneysaver.DAO.SavingPlan;
import com.moneysaver.moneysaver.DTO.Mapping.BaseDTOConverter.BaseDTOConverter;
import com.moneysaver.moneysaver.DTO.SavingPlanDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SavingPlanConverter extends BaseDTOConverter<SavingPlanDTO, SavingPlan> {
    @Override
    public SavingPlanDTO convertToDTO(SavingPlan entity) {
        SavingPlanDTO savingPlanDTO = new SavingPlanDTO();
        savingPlanDTO.setIdSavingPlan(entity.getIdSavingPlan());
        savingPlanDTO.setSavingPlanName(entity.getSavingPlanName());
        savingPlanDTO.setBudget(entity.getBudget());
        savingPlanDTO.setDateOfStart(entity.getDateOfStart());
        savingPlanDTO.setDateOfEnd(entity.getDateOfEnd());
        savingPlanDTO.setSavingGoal(entity.getSavingGoal());

        return savingPlanDTO;
    }

    @Override
    public SavingPlan convertToEntity(SavingPlanDTO dto) {
        SavingPlan savingPlan = new SavingPlan();
        savingPlan.setIdSavingPlan(dto.getIdSavingPlan());
        savingPlan.setSavingPlanName(dto.getSavingPlanName());
        savingPlan.setBudget(dto.getBudget());
        savingPlan.setDateOfStart(dto.getDateOfStart());
        savingPlan.setDateOfEnd(dto.getDateOfEnd());
        savingPlan.setSavingGoal(dto.getSavingGoal());

        return savingPlan;
    }

    @Override
    public List<SavingPlanDTO> convertToListDTO(List<SavingPlan> entity) {
        List<SavingPlanDTO> savingPlanDTOList = new ArrayList<SavingPlanDTO>();
        for(SavingPlan savingPlan : entity){
            savingPlanDTOList.add((convertToDTO(savingPlan)));
        }
        return savingPlanDTOList;
    }

    @Override
    public List<SavingPlan> convertToListEntity(List<SavingPlanDTO> dto){
        List<SavingPlan> savingPlanList = new ArrayList<SavingPlan>();
        for(SavingPlanDTO savingPlanDTO : dto){
            savingPlanList.add(convertToEntity(savingPlanDTO));
        }
        return savingPlanList;
    }
}
