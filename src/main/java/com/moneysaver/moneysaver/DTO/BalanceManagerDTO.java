package com.moneysaver.moneysaver.DTO;

import com.moneysaver.moneysaver.DAO.SavingPlan;
import com.moneysaver.moneysaver.DAO.SubCategory;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class BalanceManagerDTO {

    private Long idBalanceManager;
    private Float value;
    private String descriptionBalanceManager;
    private Date date;
    private List<SubCategoryDTO> subCategory;
    private SavingPlanDTO savingPlan;

}
