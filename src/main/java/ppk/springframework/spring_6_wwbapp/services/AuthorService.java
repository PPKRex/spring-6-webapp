package ppk.springframework.spring_6_wwbapp.services;

import ppk.springframework.spring_6_wwbapp.domain.Author;

public interface AuthorService
{
    Iterable<Author> findAll();
}
