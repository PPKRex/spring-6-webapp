package ppk.springframework.spring_6_wwbapp.services;

import org.springframework.stereotype.Service;
import ppk.springframework.spring_6_wwbapp.domain.Author;
import ppk.springframework.spring_6_wwbapp.repositories.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
