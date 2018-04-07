/*package com.avi.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.avi.jms.sender.MessageSender;

@Controller
@RequestMapping(value="/jmsTest")
public class JmsTestController {
	
	private static final Logger logger= LoggerFactory.getLogger(JmsTestController.class); 
	
	@Autowired
	private MessageSender messageSender;
	
	@RequestMapping(value="/show")
	public ModelAndView jmsTestShowPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("jmsTest");		
		return mv;
	}
	
	@RequestMapping(value="/sendMessage")
	public ModelAndView jmsTestFormHandler(@RequestParam(value="msg") String msg) {
		
		logger.info("Message recieved...");
		
		ModelAndView mv =new ModelAndView();
		messageSender.sendMessage(msg);
		mv.getModelMap().addAttribute("successMessage", "Treadstone instruction sent successfully...");
		mv.setViewName("jmsTest");
		return mv;
	}

}
*/