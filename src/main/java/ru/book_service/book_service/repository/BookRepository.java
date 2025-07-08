package ru.book_service.book_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.book_service.book_service.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Modifying
    @Query("""
            update Book book
            set book.title = :title,
            book.genre = :genre,
            book.year = :year,
            book.author = :author
            where book.id = :id
            """)
    boolean updateBookById(Long id, Book book);
    boolean deleteBookById(Long id);
}
