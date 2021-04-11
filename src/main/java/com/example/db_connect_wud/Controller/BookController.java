package com.example.db_connect_wud.Controller;

import com.example.db_connect_wud.Dto.BookDto;
import com.example.db_connect_wud.Service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<BookDto>> getAllBook() {
        return ResponseEntity.ok(bookService.getAllBook());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDto> saveBook(@RequestBody BookDto bookDto){
        return ResponseEntity.ok(bookService.saveBook(bookDto));
    }



}
