package com.example.db_connect_wud.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Long authorId;

    private Double price;

    private Double rating;

    private Long CategoryId;

    private String filePath;
    private String ISBN_10;
    private String description;
    private Long LangeageId;


}
