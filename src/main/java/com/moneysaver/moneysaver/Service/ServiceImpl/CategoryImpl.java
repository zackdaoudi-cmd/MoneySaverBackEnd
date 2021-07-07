package com.moneysaver.moneysaver.Service.ServiceImpl;

import com.moneysaver.moneysaver.DTO.CategoryDTO;
import com.moneysaver.moneysaver.DTO.Mapping.Converter.CategoryConverter;
import com.moneysaver.moneysaver.Repository.CategoryRepository;
import com.moneysaver.moneysaver.Service.IService.ICategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryImpl implements ICategory {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryConverter categoryConverter;

    /**
     * Category by type*/
    @Override
    public List<CategoryDTO> getLitsCatBuType(String type){
        return categoryConverter.convertToListDTO(categoryRepository.findCategoryByType(type));
    }
}
