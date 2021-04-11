package com.example.db_connect_wud.Repository;

import com.example.db_connect_wud.Dto.AuthorDto;
import com.example.db_connect_wud.Dto.BookDto;
import com.example.db_connect_wud.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

/*    @Query("select new com.example.db_connect_wud.Entity.BookJoin(a, b.id, b.name, b.authorId, b.price, b.rating, b.categoryId, b.filePath, b.ISBN_10, b.description, b.languageId) from Book b join Author a on b.authorId = a.id where b.id = :id")
    public List<Book>getBookBy(@Param("id") Long id);*/


}
