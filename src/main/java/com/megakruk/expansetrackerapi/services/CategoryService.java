package com.megakruk.expansetrackerapi.services;

import com.megakruk.expansetrackerapi.domain.Category;
import com.megakruk.expansetrackerapi.exceptions.EtBadRequestException;
import com.megakruk.expansetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryService {

    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId)
            throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description)
            throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category)
            throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId)
            throws EtResourceNotFoundException;
}
