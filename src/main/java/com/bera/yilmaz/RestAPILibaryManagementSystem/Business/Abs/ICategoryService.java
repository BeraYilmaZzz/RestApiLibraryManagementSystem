package com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Abs;

import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.Category;
import java.util.List;

public interface ICategoryService {
    Category getById(int id);
    Category save (Category Category);
    void delete (int id);
    Category update(Category Category);
    List<Category> findAll();
}
