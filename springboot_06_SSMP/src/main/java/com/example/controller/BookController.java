package com.example.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.controller.utils.R;
import com.example.domain.Book;
import com.example.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService iBookService;

    @GetMapping
    public R getAll(){
        return new R(true, iBookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book){
        boolean flag = iBookService.save(book);
        return new R(flag, flag ? "添加成功^_^" : "添加失败-_-!");
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(iBookService.removeById(id));
    }

    @PutMapping
    public R update(@RequestBody Book book){
        return new R(iBookService.updateById(book));

    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        System.out.println("heatload...");
        System.out.println("heatload...");

        return new R(true, iBookService.getById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize, Book book){
        IPage<Book> page = iBookService.getPage(currentPage, pageSize, book);
        if (currentPage > page.getPages()){
            page = iBookService.getPage((int)page.getPages(), pageSize);
        }
        return new R(null != page, page);
    }
}
