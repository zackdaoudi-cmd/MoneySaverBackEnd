package com.moneysaver.moneysaver.DAO;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategory ;
    private String labelCategory;

    @OneToMany
    private List<SubCategory> subCategories = new ArrayList<SubCategory>();



}
