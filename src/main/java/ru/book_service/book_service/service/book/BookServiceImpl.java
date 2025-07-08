package ru.book_service.book_service.service.book;

import org.springframework.stereotype.Service;
import ru.book_service.book_service.model.Book;
import ru.book_service.book_service.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public boolean update(Book book) {
        return bookRepository.updateBookById(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getYear(),
                book.getGenre()) > 0;
    }

    @Override
    public boolean deleteById(Long id) {
        return bookRepository.deleteBookById(id) > 0;
    }
}
