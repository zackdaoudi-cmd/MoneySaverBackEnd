package com.moneysaver.moneysaver.DTO.Mapping.Converter;

import com.moneysaver.moneysaver.DAO.BalanceManager;
import com.moneysaver.moneysaver.DTO.BalanceManagerDTO;
import com.moneysaver.moneysaver.DTO.Mapping.BaseDTOConverter.BaseDTOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BalanceManagerConverter extends BaseDTOConverter<BalanceManagerDTO, BalanceManager> {

    @Autowired
    private SavingPlanConverter savingPlanConverter;

    @Autowired
    private SubCategoryConverter subCategoryConverter;

    @Override
    public BalanceManagerDTO convertToDTO(BalanceManager entity) {
        BalanceManagerDTO balanceManagerDTO = new BalanceManagerDTO();
        balanceManagerDTO.setIdBalanceManager(entity.getIdBalanceManager());
        balanceManagerDTO.setDescriptionBalanceManager(entity.getDescriptionBalanceManager());
        balanceManagerDTO.setDate(entity.getDate());
        balanceManagerDTO.setValue(entity.getValue());
        balanceManagerDTO.setSavingPlan(savingPlanConverter.convertToDTO(entity.getSavingPlan()));
        balanceManagerDTO.setSubCategory(subCategoryConverter.convertToListDTO(entity.getSubCategory()));

        return balanceManagerDTO;
    }

    @Override
    public BalanceManager convertToEntity(BalanceManagerDTO dto) {
        BalanceManager balanceManager = new BalanceManager();

        balanceManager.setIdBalanceManager(dto.getIdBalanceManager());
        balanceManager.setDescriptionBalanceManager(dto.getDescriptionBalanceManager());
        balanceManager.setDate(dto.getDate());
        balanceManager.setValue(dto.getValue());
        balanceManager.setSavingPlan(savingPlanConverter.convertToEntity(dto.getSavingPlan()));
        balanceManager.setSubCategory(subCategoryConverter.convertToListEntity(dto.getSubCategory()));

        return balanceManager;
    }

    @Override
    public List<BalanceManagerDTO> convertToListDTO(List<BalanceManager> entity) {
        List<BalanceManagerDTO> balanceManagerDTOList = new ArrayList<BalanceManagerDTO>();
        for(BalanceManager balanceManager : entity ){
            balanceManagerDTOList.add(convertToDTO(balanceManager));
        }

        return balanceManagerDTOList;
    }

    @Override
    public List<BalanceManager> convertToListEntity(List<BalanceManagerDTO> dto) {
        List<BalanceManager> balanceManagerList = new ArrayList<BalanceManager>();
        for(BalanceManagerDTO balanceManagerDTO: dto ){
            balanceManagerList.add(convertToEntity(balanceManagerDTO));
        }
        return balanceManagerList;
    }
}
