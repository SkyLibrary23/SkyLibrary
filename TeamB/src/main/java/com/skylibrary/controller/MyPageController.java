package com.skylibrary.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skylibrary.service.ApplyBookService;
import com.skylibrary.service.RentService;
import com.skylibrary.service.UserService;
import com.skylibrary.vo.ApplyBookVO;
import com.skylibrary.vo.RentVO;
import com.skylibrary.vo.UserVO;

@Controller
@RequestMapping(value = "/myPage")
public class MyPageController {

	@Inject
	RentService rentService;
	@Inject
	UserService userService;
	@Inject
	ApplyBookService applyBookService;
	
	
	@RequestMapping(value = "/renting")
	public String renting(Model model, RentVO vo, HttpServletRequest req, UserVO userVO) throws Exception {
		
		System.out.println("In MyPageController (value=/renting)");
		
		HttpSession session = req.getSession(true);
		
		UserVO user = null;
		
		if(session.getAttribute("user") != null) {
			user = (UserVO)session.getAttribute("user");
		}
		
		List<RentVO> rvo = rentService.Rentlist(vo);
		model.addAttribute("rentList", rvo);
		model.addAttribute("user",user);
		System.out.println("Out MyPageController (value=/renting)");
		
		return "/User/myPage/renting";
	}
	
	@RequestMapping(value = "/wish")
	public String wish(Model model, HttpServletRequest req) throws Exception {
		System.out.println("In MyPageController (value=/wish)");

		System.out.println("Out MyPageController (value=/wish)");
		return "/User/myPage/wish";
	}
	
	
	//url타고 넘어왔을 때 보여주는 페이지
	@RequestMapping(value = "/wishApply")
	public String wishApply(Model model, HttpServletRequest req) throws Exception {
		System.out.println("In MyPageController (value=/wishApply)");
		
		System.out.println("Out MyPageController (value=/wishApply)");
		return "/User/myPage/wishApply";
	}
	
	//wish데이터 저장
	@RequestMapping(value="/wishOk", method = RequestMethod.POST)
	public String wisthApplied(ApplyBookVO vo,HttpServletRequest request, HttpServletResponse response)throws Exception{
		
		System.out.println("boardVO:"+ vo.toString());

		applyBookService.insert(vo);	
		
		 response.setContentType("text/html; charset=UTF-8");
         PrintWriter out = response.getWriter();
         out.println("<script>alert('신청이 완료되었습니다.'); history.go(-1);</script>");
         out.flush();
		
		 return "/User/myPage/wishApply";
		

	}
	
	@RequestMapping(value = "/wishCheck") 
	public String wishCheck(Model model, UserVO vo, HttpServletRequest req) throws Exception {
		System.out.println("In MyPageController (value=/wishCheck)");
	
		System.out.println("Out MyPageController (value=/wishCheck)");
		return "/User/myPage/wishCheck";
	}
	
	
	@RequestMapping(value = "/userInfo")
	public String userInfo(Model model, HttpServletRequest req) throws Exception {
		System.out.println("In MyPageController (value=/userInfo)");
		
		System.out.println("Out MyPageController (value=/userInfo)");
		return "/User/myPage/userInfo";
	}
	
	@RequestMapping(value = "/userInfoModify")
	public String userInfoModify(Model model) throws Exception {
		return "/User/myPage/userInfoModify";
	}
	
	@RequestMapping(value = "/userInfoModifyOk")
	public String userInfoModifyOk(Model model, UserVO vo) {
		System.out.println("In MyPageController (value=/userInfoModifyOk)");
		
		//수정한 정보를 업데이트문에 넣고 돌림
		//다시 userVO에 셋팅해 넘겨줌.
		
		System.out.println("Out MyPageController (value=/userInfoModifyOk)");
		return "/User/myPage/userInfo";
	}
	
	
	
}
