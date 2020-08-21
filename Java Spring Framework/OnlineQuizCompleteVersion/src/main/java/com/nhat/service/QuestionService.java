/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhat.service;

import com.nhat.entities.Question;
import com.nhat.repository.QuestionRepositoryIF;
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
    public List<Question> getQuestions() {

        return (List<Question>) questionRepositoryIF.findAll();
    }

    @Override
    public void saveQuestion(Question theQuestion) {
        questionRepositoryIF.save(theQuestion);
    }

    @Override
    public void deleteQuestion(int theId) {
        questionRepositoryIF.deleteById(theId);
    }

    @Override
    public boolean isExist(Question question, List<Question> list) {
        boolean flag = false;
        for (Question qs : list) {
            if (question.getQuestion_id() == qs.getQuestion_id()) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public Question getQuestion(int id) {
        Optional<Question> question = questionRepositoryIF.findById(id);
        return question.isPresent() ? question.get() : null;
    }

}
