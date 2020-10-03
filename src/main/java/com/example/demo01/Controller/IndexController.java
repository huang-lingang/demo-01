package com.example.demo01.Controller;

import com.example.demo01.dto.BookDTO;
import com.example.demo01.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private BookService bookservice;
    @RequestMapping({"/", "/index"})
    public String index(Model model) {
        List<BookDTO> bookdtolist;
        bookdtolist = bookservice.getBooks();
        model.addAttribute("books", bookdtolist);
        return "hello";
    }
}
