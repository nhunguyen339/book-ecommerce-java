package com.example.bookecommerce.api;
import com.example.bookecommerce.dto.BookDto;
import com.example.bookecommerce.model.Book;
import com.example.bookecommerce.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/book")
public class BookApi {
    @Autowired
    BookService bookService;

    @PostMapping("/create")
    BookDto createBook(@RequestBody BookDto book) {
        return bookService.createBook(book);
    }
}
