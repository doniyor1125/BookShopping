package com.example.db_connect_wud;


import org.modelmapper.ModelMapper;
import com.example.db_connect_wud.Dto.BookDto;

import com.example.db_connect_wud.Entity.Book;



class Mappers {


    public static BookDto bookEntityToBookDto(Book book) {
        return new ModelMapper().map(book, BookDto.class);
    }


}
