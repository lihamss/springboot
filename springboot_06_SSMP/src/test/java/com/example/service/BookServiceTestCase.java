package com.example.service;

import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private IBookService iBookService;

    @Test
    public void testSave(){
        Book book = new Book();
        book.setName("非贵金属");
        book.setType("附属物");
        book.setDescription("法法");
        iBookService.save(book);
    }
}
