/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.CustomerEntity;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;

/**
 *
 * @author Hoang Duy Nhat
 */
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    
    public List<CustomerEntity> getAllCustomer(){
        List<CustomerEntity> customerList =(List<CustomerEntity>)customerRepository.findAll();
        return customerList;
    }
    
    public List<CustomerEntity> findById(int id){
        return customerRepository.findById(id);
    }
    
    public List<CustomerEntity> findByNameLike(String name){
        name = "%" + name + "%";
        return customerRepository.findByNameLike(name);
    }
    
    public List<CustomerEntity> findByPhoneLikeOrEmailLike(String name, String email){
        name = "%" + name + "%";
        email = "%" + email + "%";
        return customerRepository.findByPhoneLikeOrEmailLike(name, email);
    }
    
    public List<CustomerEntity> findByBirthdayBetween(LocalDate birhtday1, LocalDate birhtday2){
        return customerRepository.findByBirthdayBetween(birhtday1, birhtday2);
    }
}
