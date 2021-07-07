package com.moneysaver.moneysaver.DTO.Mapping.Converter;

import com.moneysaver.moneysaver.DAO.Category;
import com.moneysaver.moneysaver.DTO.CategoryDTO;
import com.moneysaver.moneysaver.DTO.Mapping.BaseDTOConverter.BaseDTOConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryConverter extends BaseDTOConverter<CategoryDTO, Category> {

    @Override
    public CategoryDTO convertToDTO(Category entity) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setIdCategory(entity.getIdCategory());
        categoryDTO.setLabelCategory(entity.getLabelCategory());
        categoryDTO.setType(entity.getType());

        return categoryDTO;
    }

    @Override
    public Category convertToEntity(CategoryDTO dto) {
        Category category = new Category();
        category.setIdCategory(dto.getIdCategory());
        category.setLabelCategory(dto.getLabelCategory());
        category.setType(dto.getType());

        return category;
    }

    @Override
    public List<CategoryDTO> convertToListDTO(List<Category> entity) {
        List<CategoryDTO> categoryDTOList = new ArrayList<CategoryDTO>();
        for(Category category : entity){
            categoryDTOList.add(convertToDTO(category));
        }
        return categoryDTOList;
    }

    @Override
    public List<Category> convertToListEntity(List<CategoryDTO> dto) {
        return null;
    }
}
