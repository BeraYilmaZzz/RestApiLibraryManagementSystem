package com.bera.yilmaz.RestAPILibaryManagementSystem.Api;


import com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Abs.IBookService;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Abs.ICategoryService;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private IBookService bookService;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<Category> findAll(){
        List<Category> categoryList = categoryService.findAll();
        return categoryList;
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category category){
        return this.categoryService.save(category);
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public Category update(@RequestBody Category category){
        Category updatedCategory = this.categoryService.getById(Math.toIntExact(category.getId()));
        updatedCategory.setDescription(category.getDescription());
        updatedCategory.setName(category.getDescription());
        return this.categoryService.update(updatedCategory);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) throws Exception {
            this.categoryService.delete(id);
    }

}