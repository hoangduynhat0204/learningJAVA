package repository;

import entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Hoang Duy Nhat
 */

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Integer>{
    
    
}
