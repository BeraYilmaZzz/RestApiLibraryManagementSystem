package com.bera.yilmaz.RestAPILibaryManagementSystem.Dao;

import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookBorrowingRepo extends JpaRepository<BookBorrowing,Integer> {
}
