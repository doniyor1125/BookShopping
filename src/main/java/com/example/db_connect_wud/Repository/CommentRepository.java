package com.example.db_connect_wud.Repository;

import com.example.db_connect_wud.Entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.xml.stream.events.Comment;
import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comments, Long> {
    List<Comments> findAllByBookId(Long bookId);
}
