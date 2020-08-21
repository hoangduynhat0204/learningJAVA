/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.repository;

import com.company.entity.Book;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hoang Duy Nhat
 */
public interface BookRepositoryIF extends CrudRepository<Book, Integer>{
    
}
