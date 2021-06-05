package com.moneysaver.moneysaver.DAO;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser ;
    private String username;
    private String password ;
    private Date CreateDate ;

    @OneToMany
    private List<SavingPlan> savingPlants=new ArrayList<SavingPlan>();


    public Users(Long idUser, String username, String password) {
        this.idUser = idUser ;
        this.username = username;
        this.password = password;
    }

    public Users() {

    }
}
