package com.example.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private BookDao bookDao;
    @Test
    public void testSelectById(){
        Book book = bookDao.selectById(2);
        System.out.println(book);
    }

    @Test
    public void testGetAll(){
        List<Book> books = bookDao.selectList(null);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void testSave(){

    }

    @Test
    public void testUpdate(){

    }

    @Test
    public void testGetPage(){
        Page<Book> page = new Page<>(2,3);
        IPage<Book> iPage = bookDao.selectPage(page, null);
//        SELECT id,type,name,description FROM tab_book
        System.out.println(iPage);
    }

    @Test
    public void testGetByCondition(){
        String name = "web";
        LambdaQueryWrapper<Book> lWrapper = new LambdaQueryWrapper<Book>();
        lWrapper.like(name != null, Book::getName, name);
        bookDao.selectList(lWrapper);
    }
}
