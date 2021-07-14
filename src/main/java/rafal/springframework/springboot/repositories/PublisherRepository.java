package rafal.springframework.springboot.repositories;

import org.springframework.data.repository.CrudRepository;

import rafal.springframework.springboot.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{
 
}
