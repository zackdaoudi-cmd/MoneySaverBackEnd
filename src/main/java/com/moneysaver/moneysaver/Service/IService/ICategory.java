package com.moneysaver.moneysaver.Service.IService;

import com.moneysaver.moneysaver.DTO.CategoryDTO;

import java.util.List;

public interface ICategory {
    List<CategoryDTO> getLitsCatBuType(String type);


}
