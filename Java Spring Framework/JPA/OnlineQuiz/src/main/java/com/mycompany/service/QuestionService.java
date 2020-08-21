/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.entities.Question;
import com.mycompany.repository.QuestionRepositoryIF;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hoang Duy Nhat
 */
@Service
public class QuestionService implements QuestionServiceIF {
    
    @Autowired
    QuestionRepositoryIF questionRepositoryIF; 
    
    @Override
    public List<Question> getQuestion() {
        return (List)questionRepositoryIF.findAll();
    }

    @Override
    public void saveQuestion(Question theQuestion) {
        questionRepositoryIF.save(theQuestion);
    }

    @Override
    public Question getQuestion(int theId) {
        Optional<Question> questionOpt = questionRepositoryIF.findById(theId);
	return questionOpt.isPresent() ? questionOpt.get() : null;
    }

    @Override
    public void deleteQuestion(int theId) {
        questionRepositoryIF.deleteById(theId);
    }
    
}
