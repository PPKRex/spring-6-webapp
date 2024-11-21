package ppk.springframework.spring_6_wwbapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ppk.springframework.spring_6_wwbapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
