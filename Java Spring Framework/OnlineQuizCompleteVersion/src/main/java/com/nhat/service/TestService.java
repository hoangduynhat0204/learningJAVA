/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhat.service;

import com.nhat.entities.Test;
import com.nhat.repository.TestRepositoryIF;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hoang Duy Nhat
 */
@Service
public class TestService implements TestServiceIF {
    
    @Autowired
    TestRepositoryIF testRepositoryIF;

    @Override
    public List<Test> getTests() {
        return (List)testRepositoryIF.findAll();
    }

    @Override
    public void saveTest(Test theTest) {
        testRepositoryIF.save(theTest);
    }

    @Override
    public Test getTest(int theId) {
        Optional<Test> testOpt = testRepositoryIF.findById(theId);
	return testOpt.isPresent() ? testOpt.get() : null;
    }

    @Override
    public void deleteTest(int theId) {
        testRepositoryIF.deleteById(theId);
    }
    
}
