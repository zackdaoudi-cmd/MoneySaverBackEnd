package com.moneysaver.moneysaver.Service.IService;

import com.moneysaver.moneysaver.DTO.SubCategoryDTO;

import java.util.List;

public interface ISubCategoryImpl {
    List<SubCategoryDTO> getSubCategoryByCategory(Long id);

}
