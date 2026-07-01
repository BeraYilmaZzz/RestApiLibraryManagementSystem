package com.bera.yilmaz.RestAPILibaryManagementSystem.Api;


import com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Abs.IBookService;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Dto.Book.BookResponse;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Dto.Book.BookSaveRequest;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Dto.Book.BookUpdateRequest;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.Book;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/book")
public class BookController {
    @Autowired
    private IBookService bookService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<BookResponse> findAll(){
        List<BookResponse> bookResponseList = this.bookService.findAll().stream().map(
                book ->  this.modelMapper.map(book, BookResponse.class)
        ).collect(Collectors.toList());
        return bookResponseList;
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Book save(@RequestBody BookSaveRequest bookSaveRequest){
        Book newBook = this.modelMapper.map(bookSaveRequest,Book.class);
        return this.bookService.save(newBook);
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public Book update(@RequestBody BookUpdateRequest bookUpdateRequest){
        Book updatedBook = this.bookService.getById(Math.toIntExact(bookUpdateRequest.getId()));
        updatedBook.setName(bookUpdateRequest.getName());
        updatedBook.setPublicationYear(bookUpdateRequest.getPublicationYear());
        updatedBook.setStock(bookUpdateRequest.getStock());
        return this.bookService.update(updatedBook);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        this.bookService.delete(id);
    }

    @GetMapping("/{id}")
    public BookResponse getByID(@PathVariable("id") int id){
        return this.modelMapper.map(this.bookService.getById(id),BookResponse.class);
    }
}
