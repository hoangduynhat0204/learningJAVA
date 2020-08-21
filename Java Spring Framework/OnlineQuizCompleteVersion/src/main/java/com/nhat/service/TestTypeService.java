/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhat.service;

import com.nhat.repository.TestTypeRepositoryIF;
import com.nhat.entities.TestType;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hoang Duy Nhat
 */

@Service
public class TestTypeService implements TestTypeServiceIF{
    @Autowired
    TestTypeRepositoryIF testTypeRepositoryIF;
    
    @Override
     public List<TestType> getTestTypes() {
        return (List<TestType>) testTypeRepositoryIF.findAll();
    }

    @Override
    public TestType getTestType(String id) {
        Optional<TestType> testType = testTypeRepositoryIF.findById(id);
        return testType.isPresent() ? testType.get() : null;
    }
}
