package com.example.demo01.service;

import com.example.demo01.dto.BookDTO;
import com.example.demo01.mapper.BookMapper;
import com.example.demo01.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BookService {
    @Autowired
    private BookMapper bookmapper;
    public List<BookDTO> getBooks() {
        List<BookDTO> bookdtolist = new ArrayList<>();
        List<Book> booklist = bookmapper.getBooks();
        for(Book book: booklist) {
            BookDTO bookdto = new BookDTO();
            bookdto.setBook(book);
            bookdto.setLabel("book");
            bookdtolist.add(bookdto);
        }
        return bookdtolist;
    }
}
