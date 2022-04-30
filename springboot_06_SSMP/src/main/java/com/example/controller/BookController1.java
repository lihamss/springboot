package com.example.controller;

import com.example.domain.Book;
import com.example.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/books")
public class BookController1 {
    @Autowired
    private IBookService iBookService;

    @GetMapping
    public List<Book> getAll(){
        return iBookService.list();
    }

    @PostMapping
    public Boolean save(@RequestBody Book book){
        return iBookService.save(book);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return iBookService.removeById(id);
    }

    @PutMapping
    public Boolean update(@RequestBody Book book){
        return iBookService.updateById(book);
    }

    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id){
        return iBookService.getById(id);
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public List<Book> getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize){
        return iBookService.getPage(currentPage, pageSize).getRecords();
    }
}
