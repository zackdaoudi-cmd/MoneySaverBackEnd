package com.moneysaver.moneysaver.DTO;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class UserDTO {

        public Long idUser ;
        public String username;
        public Date CreateDate ;
        public List<SavingPlanDTO> savingPlanDTOList ;


}
