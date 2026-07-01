package com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Abs;

import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.Author;

import java.util.List;

public interface IAuthorService {
    Object getById(int id);
    Author save (Author author);
    void delete (int id);
    Author update(Author author);
    List<Author> findAll();
}
