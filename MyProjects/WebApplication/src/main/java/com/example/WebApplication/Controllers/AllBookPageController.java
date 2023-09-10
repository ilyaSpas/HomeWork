package com.example.WebApplication.Controllers;

import com.example.WebApplication.Models.Book;
import com.example.WebApplication.Repositories.BookRepository;
import com.example.WebApplication.Services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AllBookPageController {
    private final BookRepository bookRepository;
    @GetMapping("/all-books")
    public String allBooksPage(Model model, Book book) {
        Iterable<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);
        return "allBooksPage";
    }
}
