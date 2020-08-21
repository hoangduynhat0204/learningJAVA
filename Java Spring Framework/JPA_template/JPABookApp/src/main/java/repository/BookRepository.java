package repository;

import entity.BookEntity;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Integer>{
    List<BookEntity> findByPriceBetween(double price1, double price2);
    
    List<BookEntity> findByAuthorLike(String author);
    
    List<BookEntity> findByAuthorLikeAndPrice(String author, double price);
    
    List<BookEntity> findByNameLikeOrAuthorLikeOrCategoryLike(String name, String author, String category);
}
