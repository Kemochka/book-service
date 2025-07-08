package ru.book_service.book_service.service.author;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.book_service.book_service.model.Author;

import java.util.Optional;

public interface AuthorService {
    Author save(Author author);

    Page<Author> findAll(Pageable pageable);

    Optional<Author> findById(long id);
}
