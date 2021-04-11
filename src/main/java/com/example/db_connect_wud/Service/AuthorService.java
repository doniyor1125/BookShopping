package com.example.db_connect_wud.Service;

import com.example.db_connect_wud.Dto.AuthorDto;
import com.example.db_connect_wud.Entity.Author;

import org.modelmapper.ModelMapper;
import com.example.db_connect_wud.Repository.AuthorRepository;
import com.example.db_connect_wud.Repository.BookRepository;

import org.springframework.stereotype.Service;

import java.util.List;

import java.util.stream.Collectors;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final ModelMapper mapper;
    ;


    public AuthorService(AuthorRepository authorRepository, BookRepository bookRepository, ModelMapper mapper) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.mapper = mapper;
    }

    public List<AuthorDto> getAllAuthors() {
        return authorRepository.findAll().stream().map(this::convertAuthorToDto).collect(Collectors.toList());

    }

    private AuthorDto convertAuthorToDto(Author author) {
        return mapper.map(author, AuthorDto.class);
    }

    public AuthorDto saveAuthor(AuthorDto authorDto) {
        Author author = mapper.map(authorDto, Author.class);
        return mapper.map(authorRepository.save(author), AuthorDto.class);

    }
}
