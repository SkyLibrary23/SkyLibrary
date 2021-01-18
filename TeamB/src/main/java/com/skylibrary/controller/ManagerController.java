package com.skylibrary.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skylibrary.service.ManagerService;
import com.skylibrary.vo.ManagerVO;
import com.skylibrary.vo.UserVO;


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
	
	//�缭 �α���
	@RequestMapping(value = "/loginout/mlogin", method = RequestMethod.POST) 
	public String login(ManagerVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception
	{
		HttpSession session = req.getSession(true);
		
		ManagerVO login = managerservice.mlogin(vo);
		
		if(login == null ) {
			session.setAttribute("user", null);
			rttr.addFlashAttribute("msg", false);
		} else {
			session.setAttribute("user", login);
		}
		return "redirect:/";
	}
}
