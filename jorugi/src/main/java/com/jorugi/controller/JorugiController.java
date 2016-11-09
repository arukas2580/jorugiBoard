package com.jorugi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jorugi.model.JorugiTable;
import com.jorugi.service.JorugiService;

@Controller
public class JorugiController {
	@Autowired
	private JorugiService jorugiService;
	
	@RequestMapping(value="/jorugi", method = RequestMethod.GET)
    public String jorugi() {
		List<JorugiTable> jorugiTableList = jorugiService.getJorugiAll();
		System.out.println(jorugiTableList);
		
    	return "hello";
    }
}
