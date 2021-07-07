package com.moneysaver.moneysaver.DAO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class SavingPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSavingPlan ;
    private String savingPlanName ;
    private Float budget ;
    private Date dateOfStart ;
    private Date dateOfEnd ;
    private Float savingGoal ;

    @ManyToOne
    @JsonIgnore
    private Users users;

}
