package com.skylibrary.service;

import org.springframework.stereotype.Service;

import com.skylibrary.vo.ManagerVO;
import com.skylibrary.vo.SessionVO;
import com.skylibrary.vo.UserVO;

public interface ManagerService {
	
	//�缭 ȸ������
	public void mjoin(ManagerVO vo) throws Exception;
	
	//�缭 �α���
	public SessionVO mlogin(SessionVO vo) throws Exception;
}
