package com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Concrete;

import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.Book;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Abs.IBookService;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Dao.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManager implements IBookService {
    @Autowired
    private BookRepo bookRepo;

    @Override
    public Book getById(int id) {
        return this.bookRepo.findById(id).orElseThrow();
    }

    @Override
    public Book save(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public void delete(int id) {
        this.bookRepo.delete(getById(id));
    }

    @Override
    public Book update(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> findAll() {
        return this.bookRepo.findAll();
    }
}
