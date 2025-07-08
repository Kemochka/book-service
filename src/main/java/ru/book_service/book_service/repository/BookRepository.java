package ru.book_service.book_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.book_service.book_service.model.Author;
import ru.book_service.book_service.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Transactional
    @Modifying
    @Query("""
            update Book book
            set book.title = :title,
            book.author = :author,
            book.year = :year,
            book.genre = :genre
            where book.id = :id
            """)
    int updateBookById(@Param("id") Long id, @Param("title") String title, @Param("author") Author author, @Param("year") int year, @Param("genre") String genre);

    @Transactional
    @Modifying
    int deleteBookById(Long id);
}
