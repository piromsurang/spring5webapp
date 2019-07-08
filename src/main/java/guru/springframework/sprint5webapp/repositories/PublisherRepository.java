package guru.springframework.sprint5webapp.repositories;

import guru.springframework.sprint5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
