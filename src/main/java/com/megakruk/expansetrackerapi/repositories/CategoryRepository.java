package com.megakruk.expansetrackerapi.repositories;

import com.megakruk.expansetrackerapi.domain.Category;
import com.megakruk.expansetrackerapi.exceptions.EtBadRequestException;
import com.megakruk.expansetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description)
        throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category)
        throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);
}
