package com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Concrete;

import com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Abs.ICategoryService;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Dao.CategoryRepo;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager implements ICategoryService {
    @Autowired
    private CategoryRepo categoryRepo;
    @Override
    public Category getById(int id) {
        return this.categoryRepo.findById(id).orElseThrow();
    }

    @Override
    public Category save(Category Category) {
        return this.categoryRepo.save(Category);
    }

    @Override
    public void delete(int id) {
        this.categoryRepo.delete(getById(id));
    }

    @Override
    public Category update(Category Category) {
        return this.categoryRepo.save(Category);
    }

    @Override
    public List<Category> findAll() {
        return this.categoryRepo.findAll();
    }
}
