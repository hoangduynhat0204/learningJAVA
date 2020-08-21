/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.entities.Test;
import com.mycompany.service.TestServiceIF;
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

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestServiceIF testService;

    @GetMapping(value = "/list")
    public String listTests(HttpServletRequest request, Model theModel) {
	List< Test> tests = testService.getTest();
        PagedListHolder pagedListHolder = new PagedListHolder(tests);
		int page = ServletRequestUtils.getIntParameter(request, "p", 0);
		pagedListHolder.setPage(page);
		pagedListHolder.setPageSize(5);
		theModel.addAttribute("pagedListHolder", pagedListHolder);
                
	return "list-test";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
	Test theTest = new Test();
	theModel.addAttribute("test", theTest);
	return "create-test";
    }

    @PostMapping("/saveTest")
    public String saveTest(@ModelAttribute("test") Test theTest) {
	testService.saveTest(theTest);
	return "redirect:/test/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("testId") int theId,
	    Model theModel) {
	Test theTest = testService.getTest(theId);
	theModel.addAttribute("test", theTest);
	return "redirect:/test/list";
    }

    @GetMapping("/delete")
    public String deleteTest(@RequestParam("testId") int theId) {
	testService.deleteTest(theId);
	return "redirect:/test/list";
    }
}
