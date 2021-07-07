package com.moneysaver.moneysaver.DTO.Mapping.Converter;

import com.moneysaver.moneysaver.DAO.SubCategory;
import com.moneysaver.moneysaver.DTO.Mapping.BaseDTOConverter.BaseDTOConverter;
import com.moneysaver.moneysaver.DTO.SubCategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SubCategoryConverter extends BaseDTOConverter<SubCategoryDTO, SubCategory> {

    @Autowired
    private CategoryConverter categoryConverter;
    @Override
    public SubCategoryDTO convertToDTO(SubCategory entity) {
        SubCategoryDTO subCategoryDTO = new SubCategoryDTO();
        subCategoryDTO.setIdSubCategory(entity.getIdSubCategory());
        subCategoryDTO.setLabelSubCategory(entity.getLabelSubCategory());

        return subCategoryDTO;
    }

    @Override
    public SubCategory convertToEntity(SubCategoryDTO dto) {
        SubCategory subCategory = new SubCategory();
        subCategory.setIdSubCategory(dto.getIdSubCategory());
        subCategory.setLabelSubCategory(dto.getLabelSubCategory());

        return subCategory;

    }

    @Override
    public List<SubCategoryDTO> convertToListDTO(List<SubCategory> entity) {
       List<SubCategoryDTO> categoryDTOList = new ArrayList<SubCategoryDTO>();
       for(SubCategory subCategory : entity){
           categoryDTOList.add(convertToDTO(subCategory));
       }
        return categoryDTOList;
    }

    @Override
    public List<SubCategory> convertToListEntity(List<SubCategoryDTO> dto) {
        List<SubCategory> categoryList = new ArrayList<SubCategory>();
        for(SubCategoryDTO subCategoryDto : dto){
            categoryList.add(convertToEntity(subCategoryDto));
        }
        return categoryList;
    }
}
