package ppk.springframework.spring_6_wwbapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ppk.springframework.spring_6_wwbapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
