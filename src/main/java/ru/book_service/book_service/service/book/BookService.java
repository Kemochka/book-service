package ru.book_service.book_service.service.book;

import ru.book_service.book_service.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();

    Optional<Book> findById(Long id);

    boolean update(Book book);

    boolean deleteById(Long id);
}
