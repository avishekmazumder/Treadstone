package com.avi.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/ajax")
public class AjaxController {
	
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String showWelcomePage() {
		return "welcome";
	}
	
	@RequestMapping(value="/checkServletResponse",method=RequestMethod.GET)
	//@ResponseBody
	public void getAjaxRequest(HttpServletRequest request, 
							   HttpServletResponse response,
								 @RequestParam("textInput") String textInput) throws IOException {
		
		response.getWriter().write("This is the servlet response :"+textInput);
		//return "This is the servlet response :"+textInput;		
		
	}

}
