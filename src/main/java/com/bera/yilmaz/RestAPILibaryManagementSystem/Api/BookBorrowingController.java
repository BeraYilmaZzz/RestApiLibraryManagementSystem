package com.bera.yilmaz.RestAPILibaryManagementSystem.Api;

import com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Abs.IBookBorrowingService;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Abs.IBookService;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.BookBorrowing;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

public class BookBorrowingController {
    @Autowired
    private IBookBorrowingService iBookBorrowing;
    @Autowired
    private IBookService bookService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<BookBorrowing> findAll(){
        List<BookBorrowing> bookBorrowingList = this.iBookBorrowing.findAll().stream().map(
                bookBorrowing -> this.modelMapper.map(bookBorrowing,BookBorrowing.class)
        ).collect(Collectors.toList());
        return bookBorrowingList;
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public BookBorrowing save(@RequestBody BookBorrowing bookBorrowing){
        if (bookService.getById(Math.toIntExact(bookBorrowing.getId())).getStock()<0){
            throw new RuntimeException("This book out of stock !");
        }else{
            BookBorrowing newBorrow = this.modelMapper.map(bookBorrowing,BookBorrowing.class);
            return this.iBookBorrowing.save(newBorrow);
        }
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public BookBorrowing update(@RequestBody BookBorrowing bookBorrowing){
        BookBorrowing updatedBorrow = this.iBookBorrowing.getById(Math.toIntExact(bookBorrowing.getId()));
        updatedBorrow.setBorrowerName(bookBorrowing.getBorrowerName());
        updatedBorrow.setBorrowingDate(bookBorrowing.getBorrowingDate());
        updatedBorrow.setReturnDate(bookBorrowing.getReturnDate());
        return this.iBookBorrowing.update(updatedBorrow);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        this.iBookBorrowing.delete(id);
    }

    @GetMapping("/{id}")
    public BookBorrowing getByID(@PathVariable("id") int id){
        return this.iBookBorrowing.getById(id);
    }

}
