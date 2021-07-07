package com.moneysaver.moneysaver.Controller;

import com.moneysaver.moneysaver.DAO.SubCategory;
import com.moneysaver.moneysaver.DTO.SubCategoryDTO;
import com.moneysaver.moneysaver.Service.ServiceImpl.SubCategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("SubCetegory/")
public class SubCategoryController {

    @Autowired
    private SubCategoryServiceImpl subCategoryService;

    @GetMapping("subCategory/{id}")
    public List<SubCategoryDTO> listSubCategory(@PathVariable Long id){
        return subCategoryService.getSubCategoryByCategory(id);
    }

    @DeleteMapping("deleteSubCategoryById/{id}")
    public void DeleteSubCategoryById(@PathVariable Long id){
        subCategoryService.DeleteSubCategortById(id);
    }
}
