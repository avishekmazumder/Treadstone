package com.avi.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.avi.common.BusinessDayConventions;
import com.avi.web.bean.EnumFormBean;

@Controller
@RequestMapping(value="/web")
public class WebController {
	
	private static final Logger logger= LoggerFactory.getLogger(WebController.class);
	
	private String projectName = "Treadstone";
	
	
	private void initIndex(ModelMap model) {
		
		model.addAttribute("projectName", projectName);		
	}
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView showIndex() {		
		
		ModelAndView mv = new ModelAndView("index","enumForm",new EnumFormBean());		
		initIndex(mv.getModelMap());
		return mv;
	}
	
	@RequestMapping(value="/checkenum")
	public ModelAndView checkEnum(@ModelAttribute("enumForm") EnumFormBean enumForm) {
		
		System.out.println(enumForm.getEnumString());		
		if(BusinessDayConventions.contains(enumForm.getEnumString())) {
			BusinessDayConventions bdc = BusinessDayConventions.fromValue(enumForm.getEnumString());
			enumForm.setEnumResult("The inputted string is a valid BusinesDayConvention enum value: "+ bdc.getValue());
		} else {
			enumForm.setEnumResult("The inputted string is not valid enum value");
		}
		
		ModelAndView mv = new ModelAndView("index","enumForm",enumForm);
		mv.getModelMap().addAttribute("enumResult", enumForm.getEnumResult());
		initIndex(mv.getModelMap());
		
		return mv;
	}
	
	@RequestMapping(value="/pathValCheck/{val}",method=RequestMethod.GET)
	public ModelAndView checkPathValue(@PathVariable("val") String val) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("pathValue");
		mv.getModelMap().addAttribute("val", val);
		return mv;
	}
	
}
