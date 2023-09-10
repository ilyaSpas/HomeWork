package com.example.WebApplication.Controllers;

import com.example.WebApplication.Models.Book;
import com.example.WebApplication.Services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class AddBookPageController {
    private final BookService bookService;
    @GetMapping("/add-book")
    public String addBookPage() {
        return "addBookPage";
    }
    @PostMapping("/add-new-book")
    public String addNewBook(@RequestParam("file1") MultipartFile file1,
                             @ModelAttribute Book book) throws IOException {
        bookService.save(book, file1);
        return "addBookPage";
    }
}
