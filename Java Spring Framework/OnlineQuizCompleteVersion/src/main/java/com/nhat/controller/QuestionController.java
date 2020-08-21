/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhat.controller;

import com.nhat.entities.Question;
import com.nhat.service.QuestionServiceIF;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.web.bind.ServletRequestUtils;

/**
 *
 * @author Hoang Duy Nhat
 */

@Controller
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionServiceIF questionService;

    @GetMapping(value = "/list")
    public String listQuestions(HttpServletRequest request, Model theModel) {
	List< Question> questions = questionService.getQuestions();
        PagedListHolder pagedListHolder = new PagedListHolder(questions);
		int page = ServletRequestUtils.getIntParameter(request, "p", 0);
		pagedListHolder.setPage(page);
		pagedListHolder.setPageSize(5);
		theModel.addAttribute("pagedListHolder", pagedListHolder);
                
	return "list-question";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
	Question theQuestion = new Question();
	theModel.addAttribute("question", theQuestion);
	return "create-question";
    }

    @PostMapping("/saveQuestion")
    public String saveQuestion(@ModelAttribute("question") Question theQuestion) {
	questionService.saveQuestion(theQuestion);
	return "redirect:/question/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("questionId") int theId,
	    Model theModel) {
	Question theQuestion = questionService.getQuestion(theId);
	theModel.addAttribute("question", theQuestion);
	return "redirect:/question/list";
    }

    @GetMapping("/delete")
    public String deleteQuestion(@RequestParam("questionId") int theId) {
	questionService.deleteQuestion(theId);
	return "redirect:/question/list";
    }
}
