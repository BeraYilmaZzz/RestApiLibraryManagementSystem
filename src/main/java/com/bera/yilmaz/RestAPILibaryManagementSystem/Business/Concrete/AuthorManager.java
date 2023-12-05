package com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Concrete;

import com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Abs.IAuthorService;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Dao.AuthorRepo;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorManager implements IAuthorService {
    @Autowired
    private AuthorRepo authorRepo;
    @Override
    public Author getById(int id) {
        return this.authorRepo.findById(id).orElseThrow();
    }

    @Override
    public Author save(Author author) {
        return this.authorRepo.save(author);
    }

    @Override
    public void delete(int id) {
        this.authorRepo.delete(this.getById(id));
    }

    @Override
    public Author update(Author author) {
        return this.authorRepo.save(author);
    }

    @Override
    public List<Author> findAll() {
        return this.authorRepo.findAll();
    }
}
