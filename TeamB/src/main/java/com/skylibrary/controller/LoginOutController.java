package com.skylibrary.controller;

import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skylibrary.service.RecommendService;
import com.skylibrary.service.UserService;
import com.skylibrary.vo.SessionVO;
import com.skylibrary.vo.UserVO;

@Controller
@RequestMapping(value = "/loginout")
public class LoginOutController {
	
	@Inject
	UserService userService;
	
	@RequestMapping(value = "/login")
	public String login() throws Exception {
		System.out.println("In LoginoutController (value=/loginout/login)");
		System.out.println("Out LoginoutController (value=/loginout/login)");
		return "User/loginout/login";
	}
	
	//로그인
	@RequestMapping(value = "/loginOk", method = RequestMethod.POST) 
	public String login(SessionVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception
	{
		System.out.println("In LoginoutController (value=/loginout/loginOk)");
		HttpSession session = req.getSession();
		
		SessionVO login = userService.login(vo);
		if(login == null ) {
			session.setAttribute("user", null);
			rttr.addFlashAttribute("msg", false);
		} else {
			login.setCheck("U");
			session.setAttribute("user", login);
		}
		System.out.println("Out LoginoutController (value=/loginout/loginOk)");
		return "redirect:/";
	}
	
	//로그아웃
	@RequestMapping(value = "/logout", method = RequestMethod.GET) 
	public String logout(HttpSession session) throws Exception {
		System.out.println("In LoginoutController (value=/loginout/logout)");
		session.invalidate();
		System.out.println("Out LoginoutController (value=/loginout/logout)");
		return "redirect:/";
	}
	
	//아이디 찾기 
	@RequestMapping(value="/findId")
	public String findId() throws Exception {
		
			return "/User/loginout/findId";		
	}

	@RequestMapping(value="/findIdAjax", method=RequestMethod.POST)
	@ResponseBody
	public String findIdAjax(String userNum, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
			
			String userID = userService.FindId(userNum);
			
			return userID;		
	}
}
