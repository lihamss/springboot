package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.Book;
import org.springframework.stereotype.Service;


public interface IBookService extends IService<Book> {
    IPage<Book> getPage(Integer currentPage, Integer pageSize);

    IPage<Book> getPage(Integer currentPage, Integer pageSize, Book book);
}
