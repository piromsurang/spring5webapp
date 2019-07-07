package guru.springframework.sprint5webapp.repositories;

import guru.springframework.sprint5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{
}
