package com.example.db_connect_wud.Controller;

import com.example.db_connect_wud.Dto.AuthorDto;
import com.example.db_connect_wud.Service.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/author")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public ResponseEntity<List<AuthorDto>> getAllAuthors() {
        return ResponseEntity.ok(authorService.getAllAuthors());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorDto> saveAuthor(@RequestBody AuthorDto authorDto){
        return ResponseEntity.ok(authorService.saveAuthor(authorDto));
    }
}
