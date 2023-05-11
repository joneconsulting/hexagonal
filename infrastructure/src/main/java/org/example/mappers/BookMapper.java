package org.example.mappers;

import org.example.entity.Book;
import org.example.data.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "price", target = "price")
    BookDto bookToBookDto(Book book);

    Book bookDtoToBook(BookDto bookDto);
    List<BookDto> bookListToBookDtoList(List<Book> bookList);
    List<Book> BookDtoListToBookList(List<BookDto> BookDtoList);
}
