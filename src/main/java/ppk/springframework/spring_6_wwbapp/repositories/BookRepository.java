package ppk.springframework.spring_6_wwbapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ppk.springframework.spring_6_wwbapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
