package com.bera.yilmaz.RestAPILibaryManagementSystem.Dao;

import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
}
