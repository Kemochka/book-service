package ru.book_service.book_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.book_service.book_service.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
