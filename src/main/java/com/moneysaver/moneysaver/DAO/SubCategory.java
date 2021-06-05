package com.moneysaver.moneysaver.DAO;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSubCategory;
    private String labelSubCategory;

    @ManyToOne
    @JoinColumn(name="idCategory")
    private Category category;

//    @ManyToOne
//    @JoinColumn(name = "idBalanceManager")
//    private BalanceManager  balanceManager;
}
