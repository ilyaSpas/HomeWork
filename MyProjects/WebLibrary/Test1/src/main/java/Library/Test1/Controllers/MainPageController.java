package Library.Test1.Controllers;

import Library.Test1.Models.Book;
import Library.Test1.Repositorys.BookRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@Controller
@RequiredArgsConstructor
public class MainPageController {

    @Autowired
    private final BookRepository bookRepository;

    public Long getBookCount() {
        return bookRepository.count();
    }

    @GetMapping("/")
    public String mainPage(Book book,Model model) {

        model.addAttribute("libSize", getBookCount());
        Iterable<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);

        return "mainPage";
    }

    @PostMapping("/create")
    public String createBook(@ModelAttribute @Valid Book book, BindingResult bindingResult, Model model) {

        if (!bindingResult.hasErrors()) {

            bookRepository.save(book);

        }

        model.addAttribute("libSize", getBookCount());
        Iterable<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);

        return "mainPage";
    }

    @GetMapping("/book/{id}")
    public String bookDetails(@PathVariable(value = "id") long id, Model model) {

        if (!bookRepository.existsById(id)) {
            return "redirect:/";
        }

        Optional<Book> book = bookRepository.findById(id);
        ArrayList<Book> res = new ArrayList<>();
        book.ifPresent(res::add);
        model.addAttribute("book", res);

        return "bookDetails";
    }

    @PostMapping("/book/{id}/delete")
    public String bookDelete(@PathVariable(value = "id") long id) {

        Book book = bookRepository.findById(id).orElseThrow();
        bookRepository.delete(book);

        return "redirect:/";
    }

    @GetMapping("/book/{id}/edit")
    public String bookEdit(@PathVariable(value = "id") long id, Model model) {

        if (!bookRepository.existsById(id)) {
            return "redirect:/";
        }

        Optional<Book> book = bookRepository.findById(id);
        ArrayList<Book> res = new ArrayList<>();
        book.ifPresent(res::add);
        model.addAttribute("book", res);

        return "bookEdit";
    }

    @PostMapping("/book/{id}/edit")
    public String bookUpdate(@PathVariable(value = "id") long id,
                             @RequestParam String title,
                             @RequestParam String author,
                             @RequestParam String dateOfWright,
                             @RequestParam String size) {

        Book book = bookRepository.findById(id).orElseThrow();
        book.setTitle(title);
        book.setAuthor(author);
        book.setDateOfWright(dateOfWright);
        book.setSize(size);
        bookRepository.save(book);

        return "redirect:/book/{id}";
    }

}
