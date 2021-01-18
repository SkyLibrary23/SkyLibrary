package com.skylibrary.service;

import com.skylibrary.vo.SessionVO;
import com.skylibrary.vo.UserVO;

public interface UserService {
	
	//로그인하기
	public SessionVO login(SessionVO vo) throws Exception;
	
	//회원가입
	public void join(UserVO vo) throws Exception;
	
	public UserVO userInfo(UserVO vo) throws Exception;

}
