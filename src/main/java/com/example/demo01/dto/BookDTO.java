package com.example.demo01.dto;

import com.example.demo01.model.Book;

public class BookDTO {
    private Book book;
    private String label;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
