package com.bera.yilmaz.RestAPILibaryManagementSystem.Dao;

import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
