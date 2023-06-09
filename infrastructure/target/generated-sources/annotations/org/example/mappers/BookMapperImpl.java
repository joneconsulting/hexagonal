package org.example.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.example.data.BookDto;
import org.example.data.BookDto.BookDtoBuilder;
import org.example.entity.Book;
import org.example.entity.Book.BookBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-11T07:30:43+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class BookMapperImpl implements BookMapper {

    @Override
    public BookDto bookToBookDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDtoBuilder bookDto = BookDto.builder();

        bookDto.id( book.getId() );
        bookDto.title( book.getTitle() );
        bookDto.description( book.getDescription() );
        bookDto.price( book.getPrice() );

        return bookDto.build();
    }

    @Override
    public Book bookDtoToBook(BookDto bookDto) {
        if ( bookDto == null ) {
            return null;
        }

        BookBuilder book = Book.builder();

        book.id( bookDto.getId() );
        book.title( bookDto.getTitle() );
        book.description( bookDto.getDescription() );
        book.price( bookDto.getPrice() );

        return book.build();
    }

    @Override
    public List<BookDto> bookListToBookDtoList(List<Book> bookList) {
        if ( bookList == null ) {
            return null;
        }

        List<BookDto> list = new ArrayList<BookDto>( bookList.size() );
        for ( Book book : bookList ) {
            list.add( bookToBookDto( book ) );
        }

        return list;
    }

    @Override
    public List<Book> BookDtoListToBookList(List<BookDto> BookDtoList) {
        if ( BookDtoList == null ) {
            return null;
        }

        List<Book> list = new ArrayList<Book>( BookDtoList.size() );
        for ( BookDto bookDto : BookDtoList ) {
            list.add( bookDtoToBook( bookDto ) );
        }

        return list;
    }
}
