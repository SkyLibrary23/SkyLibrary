package com.skylibrary.controller;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skylibrary.service.ApplyBookService;
import com.skylibrary.vo.ApplyBookVO;
import com.skylibrary.vo.SearchVO;

@Controller
@RequestMapping(value="/mwish")
public class mWishController {
	
	@Inject
	ApplyBookService applyService;
	
	@RequestMapping(value="/mWish", method=RequestMethod.GET)
	public String getWishList(Locale locale, Model model) throws Exception {
		return "/Manager/mwish/mWish";
	}
	
	@RequestMapping(value="/ajax/checkedSave")
	public String wishCheckedSave(ApplyBookVO vo) throws Exception {
		applyService.checkedSave(vo);
		return "redirect:/mwish/ajax/searchOk";
	}
	
	@RequestMapping(value="/ajax/searchOk")
	@ResponseBody
	public List<Map<String,String>> wishSearchOk(SearchVO vo) throws Exception {
		System.out.println("vo::"+vo);
		List<Map<String,String>> wishListMap = applyService.wishSearchOk(vo);
		System.out.println("wishListMap::"+wishListMap);
		return wishListMap;
	}
	
	@RequestMapping(value="/ajax/detailOk")
	@ResponseBody
	public Map<String,String> wishDetailOk(ApplyBookVO vo) throws Exception{
		System.out.println("voDate::"+vo.getApplyDate()+",vo::"+vo);
		Map<String,String> wishDetailMap = applyService.wishDetailOk(vo);
		System.out.println("wishDetailMap::"+wishDetailMap);
		return wishDetailMap;
	}
}
