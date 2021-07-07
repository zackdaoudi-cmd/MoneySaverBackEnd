package com.moneysaver.moneysaver.Service.ServiceImpl;

import com.moneysaver.moneysaver.DAO.SubCategory;
import com.moneysaver.moneysaver.DTO.Mapping.Converter.SubCategoryConverter;
import com.moneysaver.moneysaver.DTO.SubCategoryDTO;
import com.moneysaver.moneysaver.Repository.SubCategoryRepository;
import com.moneysaver.moneysaver.Service.IService.ISubCategoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SubCategoryServiceImpl implements ISubCategoryImpl {

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @Autowired
    private SubCategoryConverter subCategoryConverter;

    @Override
    public List<SubCategoryDTO> getSubCategoryByCategory(Long id){
        List<SubCategory> sub = subCategoryRepository.getSubCategoryByCategoryIdCategory(id);
        List<SubCategory> s = subCategoryRepository.getSubCategoryByCategoryIdCategory(id);
        List<SubCategoryDTO> list = subCategoryConverter.convertToListDTO(s);

        return list;
    }

    @Transactional
    public void DeleteSubCategortById(Long id){
        subCategoryRepository.deleteById(id);
    }
}
