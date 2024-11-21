package ppk.springframework.spring_6_wwbapp.services;

import ppk.springframework.spring_6_wwbapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
