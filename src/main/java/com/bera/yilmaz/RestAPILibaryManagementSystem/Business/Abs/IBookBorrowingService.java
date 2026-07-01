package com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Abs;


import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.BookBorrowing;
import java.util.List;

public interface IBookBorrowingService {
    BookBorrowing getById(int id);
    BookBorrowing save (BookBorrowing BookBorrowing);
    void delete (int id);
    BookBorrowing update(BookBorrowing BookBorrowing);
    List<BookBorrowing> findAll();
}
