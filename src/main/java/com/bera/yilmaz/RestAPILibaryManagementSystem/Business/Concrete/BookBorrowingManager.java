package com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Concrete;

import com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Abs.IBookBorrowingService;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Dao.BookBorrowingRepo;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.BookBorrowing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookBorrowingManager implements IBookBorrowingService {
    @Autowired
    private BookBorrowingRepo borrowRepo;


    @Override
    public BookBorrowing getById(int id) {
        return this.borrowRepo.findById(id).orElseThrow();
    }

    @Override
    public BookBorrowing save(BookBorrowing BookBorrowing) {
        return this.borrowRepo.save(BookBorrowing);
    }

    @Override
    public void delete(int id) {
        this.borrowRepo.delete(getById(id));
    }

    @Override
    public BookBorrowing update(BookBorrowing BookBorrowing) {
        return this.borrowRepo.save(BookBorrowing);
    }

    @Override
    public List<BookBorrowing> findAll() {
        return this.borrowRepo.findAll();
    }
}
