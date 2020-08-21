/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhat.service;

import com.nhat.entities.TestType;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Hoang Duy Nhat
 */

public interface TestTypeServiceIF {
    public List<TestType> getTestTypes();
    public TestType getTestType(String id);
    
}
