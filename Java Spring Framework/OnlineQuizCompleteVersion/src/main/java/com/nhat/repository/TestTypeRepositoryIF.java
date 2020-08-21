/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhat.repository;

import com.nhat.entities.TestType;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hoang Duy Nhat
 */

public interface TestTypeRepositoryIF extends CrudRepository<TestType, String>{
    
}
