/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhat.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Hoang Duy Nhat
 */

@Entity(name = "test_type")
public class TestType implements Serializable {
    
    @Id
    private String test_type_id;
    
    private String test_type_name;
    
    public TestType() {
    }

    public TestType(String test_type_id, String test_type_name) {
        this.test_type_id = test_type_id;
        this.test_type_name = test_type_name;
    }

    public String getTest_type_id() {
        return test_type_id;
    }

    public void setTest_type_id(String test_type_id) {
        this.test_type_id = test_type_id;
    }

    public String getTest_type_name() {
        return test_type_name;
    }

    public void setTest_type_name(String test_type_name) {
        this.test_type_name = test_type_name;
    }

    
}
