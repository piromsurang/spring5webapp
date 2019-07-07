package guru.springframework.sprint5webapp.repositories;

import guru.springframework.sprint5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
