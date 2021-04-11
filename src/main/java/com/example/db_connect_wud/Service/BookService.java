package com.example.db_connect_wud.Service;

import com.example.db_connect_wud.Dto.BookDto;
import com.example.db_connect_wud.Entity.Book;
import com.example.db_connect_wud.Repository.AuthorRepository;
import com.example.db_connect_wud.Repository.BookRepository;
import com.example.db_connect_wud.Repository.CommentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final CommentRepository commentRepository;
    private final ModelMapper mapper;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository, CommentRepository commentRepository, ModelMapper mapper) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.commentRepository = commentRepository;
        this.mapper = mapper;
    }

    public List<BookDto> getAllBook() {
        return bookRepository.findAll().stream().map(this::convertBookToDto).collect(Collectors.toList());

    }

    private BookDto convertBookToDto(Book book) {
        return mapper.map(book, BookDto.class);
    }

    public BookDto saveBook(BookDto bookDto) {
        Book book = mapper.map(bookDto, Book.class);
        return mapper.map(bookRepository.save(book), BookDto.class);

    }


}
