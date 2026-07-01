package com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Abs;

import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.Book;
import java.util.List;

public interface IBookService {
    Book getById(int id);
    Book save (Book Book);
    void delete (int id);
    Book update(Book Book);
    List<Book> findAll();
}
