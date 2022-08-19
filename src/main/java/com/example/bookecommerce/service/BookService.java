package com.example.bookecommerce.service;

import com.example.bookecommerce.dto.BookDto;
import com.example.bookecommerce.model.Book;
import com.example.bookecommerce.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

//    public List<BookDto> getBooks() {
//        List<Book> books = bookRepository.findAll();
//
//        List<BookDto> booksDto = new ArrayList<BookDto>();
//
//        books.forEach(book -> {
//            BookDto currentBookDto = new BookDto();
//            currentBookDto.setId(book.getId());
//            currentBookDto.setName(book.getName());
//            currentBookDto.setUpdatedDate(book.getUpdatedDate());
//            booksDto.add(currentBookDto);
//        });
//        return booksDto;
//    }

    public BookDto createBook(BookDto bookDto) {
        Book book = new Book();


        book.setId(bookDto.getId());
        book.setName(bookDto.getName());
        book.setPrice(bookDto.getPrice());
        book.setUpdatedDate(bookDto.getUpdatedDate());
//        book.setCreatedDate(new Date());

        Book createdBook = bookRepository.save(book);

        BookDto createdBookDto = new BookDto();

        createdBookDto.setId(createdBook.getId());
        createdBookDto.setName(createdBook.getName());
        createdBookDto.setPrice(createdBook.getPrice());
        createdBookDto.setUpdatedDate(createdBook.getUpdatedDate());
        createdBookDto.setCreatedDate(new Date());

        return createdBookDto;
    }
}
