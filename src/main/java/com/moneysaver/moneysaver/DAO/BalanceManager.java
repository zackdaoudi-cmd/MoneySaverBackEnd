package com.moneysaver.moneysaver.DAO;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
public class BalanceManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBalanceManager;
    private Float value ;
    private String descriptionBalanceManager;
    private Date date ;

    @OneToMany
    private List<SubCategory> subCategory ;

    @OneToOne
    @JoinColumn(name="savingPlant_Id",referencedColumnName = "idSavingPlan")
    private SavingPlan savingPlan;


}
