/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhat.service;

import com.nhat.entities.Question;
import java.util.List;

/**
 *
 * @author Hoang Duy Nhat
 */
public interface QuestionServiceIF {
    public void saveQuestion(Question theQuestion);
    public Question getQuestion(int theId);
    public void deleteQuestion(int theId);
    public boolean isExist(Question question, List<Question> list);
    public List<Question> getQuestions();
}
