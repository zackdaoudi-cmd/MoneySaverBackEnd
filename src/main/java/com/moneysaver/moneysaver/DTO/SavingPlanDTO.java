package com.moneysaver.moneysaver.DTO;

import com.moneysaver.moneysaver.DAO.Users;
import lombok.Data;

import java.util.Date;

@Data
public class SavingPlanDTO {

        private Long idSavingPlan ;
        private String savingPlanName ;
        private Float budget ;
        private Date dateOfStart ;
        private Date dateOfEnd ;
        private Float savingGoal ;
        private Users users;
}
