package k24.bookstore.domain;

import org.hibernate.mapping.List;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {
}
