package com.skylibrary.service;

<<<<<<< HEAD
import java.util.List;

=======
import com.skylibrary.vo.SessionVO;
>>>>>>> 210115
import com.skylibrary.vo.UserVO;

public interface UserService {
	
	//로그인하기
<<<<<<< HEAD
	public UserVO login(UserVO vo) throws Exception;
=======
	public SessionVO login(SessionVO vo) throws Exception;
>>>>>>> 210115
	
	//회원가입
	public void join(UserVO vo) throws Exception;
	
	//동일 아이디 존재 여부
	public int userExist(UserVO vo) throws Exception;
	
	
	//유저들 정보 조회
	public List<UserVO> userList() throws Exception;
	
	//유저 정보 수정
	public void userModify(UserVO vo) throws Exception;
	
	//유저 삭제 & 유저 탈퇴
	public void userRemove(UserVO vo) throws Exception;
}
