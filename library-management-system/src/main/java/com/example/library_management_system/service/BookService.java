
package com.example.library_management_system.service;

import com.example.library_management_system.entity.Book;
import com.example.library_management_system.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Book not found: " + id));
    }

    public Book updateBook(Long id, Book updatedBook) {
        Book existingBook = getBookById(id);

        existingBook.setTitle(updatedBook.getTitle());
        existingBook.setAuthor(updatedBook.getAuthor());
        existingBook.setCategory(updatedBook.getCategory());
        existingBook.setIsbn(updatedBook.getIsbn());
        existingBook.setTotalCopies(updatedBook.getTotalCopies());
        existingBook.setAvailableCopies(updatedBook.getAvailableCopies());
        existingBook.setCoverImage(updatedBook.getCoverImage());

        return bookRepository.save(existingBook);
    }

    public void deleteBook(Long id) {
        Book existingBook = getBookById(id);
        bookRepository.delete(existingBook);
    }
}
