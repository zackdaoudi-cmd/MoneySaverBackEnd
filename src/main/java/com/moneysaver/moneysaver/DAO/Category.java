package com.moneysaver.moneysaver.DAO;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategory ;
    private String labelCategory;
    private String type;

    @OneToMany
    private List<SubCategory> subCategories ;



}
