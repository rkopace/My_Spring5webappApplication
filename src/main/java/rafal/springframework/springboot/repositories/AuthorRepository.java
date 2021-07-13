package rafal.springframework.springboot.repositories;

import org.springframework.data.repository.CrudRepository;

import rafal.springframework.springboot.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
