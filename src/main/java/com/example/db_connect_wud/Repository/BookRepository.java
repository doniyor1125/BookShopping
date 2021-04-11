package com.example.db_connect_wud.Repository;

import com.example.db_connect_wud.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {


}
