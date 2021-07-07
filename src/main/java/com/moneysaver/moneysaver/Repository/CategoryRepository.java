package com.moneysaver.moneysaver.Repository;

import com.moneysaver.moneysaver.DAO.Category;
import com.moneysaver.moneysaver.DTO.CategoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

    List<Category> findCategoryByType(String type);

}
