package com.example.db_connect_wud.Service;

import com.example.db_connect_wud.Repository.AuthorRepository;
import com.example.db_connect_wud.Repository.BookRepository;
import com.example.db_connect_wud.Repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final CommentRepository commentRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository, CommentRepository commentRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.commentRepository = commentRepository;
    }


}
