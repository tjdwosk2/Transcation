package com.ict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ict.model.service.MyService;
import com.ict.model.vo.VO;

@Controller
public class MyController {
	@Autowired
	private MyService myService;
	public void setMyService(MyService myService) {
		this.myService = myService;
	}
	
	@RequestMapping("result.do")
	public ModelAndView resultCommand(@ModelAttribute("vo") VO vo) {
		ModelAndView mv = new ModelAndView("result");
		try {
			int res = myService.getInsert(vo);
			mv.addObject("res", res);
		} catch (Exception e) {
			return new ModelAndView("error");
		}
		return mv;
	}
}











