/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.entities.Test;
import java.util.List;

/**
 *
 * @author Hoang Duy Nhat
 */
public interface TestServiceIF {
    public List <Test> getTest();
    public void saveTest(Test theTest);
    public Test getTest(int theId);
    public void deleteTest(int theId);
}
