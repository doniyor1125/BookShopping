package com.example.db_connect_wud.Repository;

import com.example.db_connect_wud.Entity.Author;
import com.example.db_connect_wud.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
