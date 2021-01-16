package com.skylibrary.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skylibrary.service.ManagerService;
import com.skylibrary.vo.ManagerVO;


@Controller
@RequestMapping(value = "/User")
public class ManagerController {

	@Inject
	ManagerService managerservice;
	
	// �缭 ȸ������ get
	@RequestMapping(value = "/join/mjoin", method = RequestMethod.GET)
	public void getMjoin() throws Exception {

	}
	
	// �缭 ȸ������ post
	@RequestMapping(value = "/join/mjoinOk", method = RequestMethod.POST)
	public String postMjoin(ManagerVO vo) throws Exception {
		
		managerservice.mjoin(vo);
		
		return "redirect:/";
	}
}
