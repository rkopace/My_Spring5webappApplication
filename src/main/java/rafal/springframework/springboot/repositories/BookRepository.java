package rafal.springframework.springboot.repositories;

import org.springframework.data.repository.CrudRepository;

import rafal.springframework.springboot.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
