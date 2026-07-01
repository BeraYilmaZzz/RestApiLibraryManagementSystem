package com.bera.yilmaz.RestAPILibaryManagementSystem.Dao;

import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository <Author,Integer> {
}
