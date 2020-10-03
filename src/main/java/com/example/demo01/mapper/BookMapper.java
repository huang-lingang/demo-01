package com.example.demo01.mapper;

import com.example.demo01.model.Book;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Component
@Mapper
public interface BookMapper {
    @Select("SELECT * FROM book")
    List<Book> getBooks();
}
