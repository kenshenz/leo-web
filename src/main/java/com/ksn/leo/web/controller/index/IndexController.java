package com.ksn.leo.web.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ksn.core.annonation.LoggerAnnotation;
import com.ksn.leo.web.controller.BaseController;

@Controller
@RequestMapping("/uc")
public class IndexController extends BaseController {

	@RequestMapping(path = "/index.htm", method = RequestMethod.GET)
	@LoggerAnnotation(desc = "系统首页")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
}
