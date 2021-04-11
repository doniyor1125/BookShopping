package com.example.db_connect_wud.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CommentDto {

    private Long id;
    private Long bookId;
    private String comment;
    private Date created;

}
