package com.itwill.shop.dao;

import java.util.List;

import com.itwill.shop.domain.Category;

public interface CategoryDao {
	
	Category findCategoryByno(Integer categoryNo);
	List<Category> findCategoryAll();
	int insertCategory(Category category);
	int updateCategoryByNo(Category category);
	int deleteCategoryByNo(Integer categoryNo);

}
