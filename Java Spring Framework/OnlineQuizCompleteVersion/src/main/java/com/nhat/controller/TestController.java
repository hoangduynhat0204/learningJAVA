/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhat.controller;

import com.nhat.entities.Question;
import com.nhat.entities.Test;
import com.nhat.entities.TestModel;
import com.nhat.entities.TestType;
import com.nhat.service.QuestionServiceIF;
import com.nhat.service.TestServiceIF;
import com.nhat.service.TestTypeServiceIF;
import java.util.ArrayList;
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
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestServiceIF testService;

    @Autowired
    TestTypeServiceIF testTypeService;

    @Autowired
    QuestionServiceIF questionSerivce;

    @GetMapping(value = "/list")
    public String listTests(HttpServletRequest request, Model theModel) {
        List< Test> tests = testService.getTests();
        PagedListHolder pagedListHolder = new PagedListHolder(tests);
        int page = ServletRequestUtils.getIntParameter(request, "p", 0);
        pagedListHolder.setPage(page);
        pagedListHolder.setPageSize(5);
        theModel.addAttribute("pagedListHolder", pagedListHolder);

        return "list-test";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        TestModel testModel = new TestModel();
        theModel.addAttribute("testModel", testModel);
        List<TestType> listTestType = testTypeService.getTestTypes();
        theModel.addAttribute("testType", listTestType);
        return "create-test";
    }

    @GetMapping("/inputQuestion")
    public String inputQuestion(@RequestParam("testId") int id, Model model) {
        List<Question> listQuestionCheck = testService.getTest(id).getListQuestion();
        model.addAttribute("listQuestionCheck", listQuestionCheck);
        List<Question> listQuestion = questionSerivce.getQuestions();
        List<Question> listQuestionUncheck = new ArrayList<Question>();

        for (Question question : listQuestion) {
            if (questionSerivce.isExist(question, listQuestionCheck) == false) {
                listQuestionUncheck.add(question);
            }
        }
        model.addAttribute("listQuestionUncheck", listQuestionUncheck);
        TestModel testModel = new TestModel();
        model.addAttribute("testModel", testModel);
        model.addAttribute("test_id", id);

        return "input-question";
    }

    @PostMapping("/saveTest")
    public String saveTest(@ModelAttribute("testModel") TestModel testModel) {

        TestType test_type = testTypeService.getTestType(testModel.getTest_type_id());

        Test test = testService.getTest(testModel.getTest_id());
        if (test != null) {
            test.setTest_name(testModel.getTest_name());
            test.setDescription(testModel.getDescription());
            test.setTest_time(testModel.getTest_time());
            test.setPassword(testModel.getPassword());
            test.setTest_type(test_type);
            test.setQuestion_number(testModel.getQuestion_number());
            testService.saveTest(test);
        } else {
            test = new Test();
            test.setTest_name(testModel.getTest_name());
            test.setDescription(testModel.getDescription());
            test.setTest_time(testModel.getTest_time());
            test.setPassword(testModel.getPassword());
            test.setTest_type(test_type);
            test.setQuestion_number(testModel.getQuestion_number());
            testService.saveTest(test);

        }

        return "redirect:/test/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("testId") int id, Model model) {
        Test test = testService.getTest(id);
        TestModel testModel = new TestModel();
        testModel.setTest_name(test.getTest_name());
        testModel.setDescription(test.getDescription());
        testModel.setTest_time(test.getTest_time());
        testModel.setPassword(test.getPassword());
        testModel.setTest_type_id(test.getTest_type().getTest_type_id());
        testModel.setQuestion_number(test.getQuestion_number());
        model.addAttribute("testModel", testModel);
        List<TestType> listTestType = testTypeService.getTestTypes();
        model.addAttribute("testType", listTestType);
        model.addAttribute("test_id", id);
        return "create-test";
    }

    @GetMapping("/delete")
    public String deleteTest(@RequestParam("testId") int theId) {
        testService.deleteTest(theId);
        return "redirect:/test/list";
    }

    @PostMapping(value = "/saveListQuestion")
    public String saveListQuestion(@ModelAttribute("testModel") TestModel testModel) {
        List<Question> listQuestion = new ArrayList<Question>();
        for (int question_id : testModel.getList_question_id()) {
            listQuestion.add(questionSerivce.getQuestion(question_id));
        }
        Test test = testService.getTest(testModel.getTest_id());
        test.setListQuestion(listQuestion);

        testService.saveTest(test);

        return "redirect:/test/list";
    }
}
