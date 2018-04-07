package com.avi.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.avi.model.Asset;
import com.avi.service.AssetRecruitmentService;

@Controller
@RequestMapping(value="/asset")
public class AssetFormController {
	
	@Autowired
	AssetRecruitmentService assetRecruitmentService;
	
	private List<String> countryList;
	private List<String> skillsList;
	
	public List<String> getSkillsList() {
		return skillsList;
	}

	public void setSkillsList(List<String> skillsList) {
		this.skillsList = skillsList;
	}

	@RequestMapping(value="/recruitForm",method=RequestMethod.GET)
	public ModelAndView showRecruitmentForm() {
		
		Asset asset = new Asset();
		this.setCountryList(assetRecruitmentService.populateCountryList());
		this.setSkillsList(assetRecruitmentService.populateSkillsList());
		
		ModelAndView mv = new ModelAndView("assetRecruitment","asset",asset);
		mv.getModelMap().addAttribute("countryList", this.getCountryList());
		mv.getModelMap().addAttribute("skillsList", this.getSkillsList());
		return mv;
	}
	
	@RequestMapping(value="/recruit",method=RequestMethod.POST)
	public ModelAndView addRecruit(@ModelAttribute("asset") Asset asset) {	
			
		ModelAndView mv = new ModelAndView();
		mv.setViewName("assetRecruitSuccess");
		mv.getModelMap().addAttribute("asset", asset);
		System.out.println(asset.getName());
		System.out.println(asset.getPostedCountry());
		System.out.println(asset.getGender());
		System.out.println(asset.getSkills().toString());
		
		return mv;
	}

	public List<String> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<String> countryList) {
		this.countryList = countryList;
	}

}
