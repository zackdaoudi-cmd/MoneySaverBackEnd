package com.moneysaver.moneysaver.Repository;


import com.moneysaver.moneysaver.DAO.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory,Long> {

    List<SubCategory> findSubCategoryByCategoryIdCategory(Long id);
    List<SubCategory> getSubCategoryByCategoryIdCategory(Long id);


}
