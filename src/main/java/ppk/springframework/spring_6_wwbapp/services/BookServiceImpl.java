package ppk.springframework.spring_6_wwbapp.services;

import org.springframework.stereotype.Service;
import ppk.springframework.spring_6_wwbapp.domain.Book;
import ppk.springframework.spring_6_wwbapp.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
