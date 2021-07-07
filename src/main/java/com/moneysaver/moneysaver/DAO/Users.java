package com.moneysaver.moneysaver.DAO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private List<SavingPlan> savingPlants;


    public Users(Long idUser, String username, String password) {
        this.idUser = idUser ;
        this.username = username;
        this.password = password;
    }

    public Users() {}

}
