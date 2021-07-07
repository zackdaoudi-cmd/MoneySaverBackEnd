package com.moneysaver.moneysaver.Controller;

import com.moneysaver.moneysaver.DTO.CategoryDTO;
import com.moneysaver.moneysaver.Service.IService.ICategory;
import com.moneysaver.moneysaver.Service.ServiceImpl.CategoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Category/")
public class CategoryController {

    @Autowired
    private ICategory categoryService;

    @GetMapping("ListCategory/{type}")
    public List<CategoryDTO> listCategory(@PathVariable String type){

        return categoryService.getLitsCatBuType(type);
    }
}
