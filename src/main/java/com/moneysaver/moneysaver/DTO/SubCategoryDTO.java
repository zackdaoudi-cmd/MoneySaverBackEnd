package com.moneysaver.moneysaver.DTO;

import com.moneysaver.moneysaver.DAO.Category;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class SubCategoryDTO {

    private Long idSubCategory;
    private String labelSubCategory;
    private CategoryDTO category;
}
