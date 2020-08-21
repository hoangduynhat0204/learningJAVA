/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import entity.CustomerEntity;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hoang Duy Nhat
 */
public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer>{
    List<CustomerEntity> findById(int id);
    List<CustomerEntity> findByNameLike(String name);
    List<CustomerEntity> findByPhoneLikeOrEmailLike(String name, String email);
    List<CustomerEntity> findByBirthdayBetween(LocalDate birhtday1, LocalDate birhtday2);
}
