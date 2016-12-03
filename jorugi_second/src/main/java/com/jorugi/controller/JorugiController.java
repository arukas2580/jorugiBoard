package com.jorugi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jorugi.model.JorugiBoard;
import com.jorugi.model.JorugiTable;
import com.jorugi.service.JorugiService;

@Controller
public class JorugiController {
	@Autowired
	private JorugiService jorugiService;
	
	@RequestMapping(value="/jorugi", method = RequestMethod.GET)
    public String jorugi() {
		//List<JorugiTable> jorugiTableList = jorugiService.getJorugiAll();
		//System.out.println(jorugiTableList);
		
    	return "hello";
    }
	
	@RequestMapping(value="/api/moveJorugiBoard", method = RequestMethod.GET)
    public String moveJorugiBoard() {		
    	return  "board/board_main";
    }
	
	@ResponseBody
	@RequestMapping(value="/api/getJorugiBoardList", method = RequestMethod.POST)
    public List<JorugiBoard> getJorugiBoardList() {		
		System.out.println("getJorugiBoardList");
		List<JorugiBoard> jorugiBoardList = jorugiService.getJorugiBoardList();
		return jorugiBoardList;	
    }
	
	@ResponseBody
	@RequestMapping(value="/api/jorugi", method = RequestMethod.POST)
    public List<JorugiTable> getJorugiTableList() {		
		System.out.println("getJorugiTableList");
		List<JorugiTable> jorugiTableList = jorugiService.getJorugiAll();
		return jorugiTableList;	
    }	
}
