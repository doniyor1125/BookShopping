package com.example.db_connect_wud.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private Long id;
    private String name;
    private Long authorId;
    private Double price;
    private Double rating;
    private Long categoryId;
    private String filePath;
    private String ISBN_10;
    private String description;
    private Long languageId;

}
