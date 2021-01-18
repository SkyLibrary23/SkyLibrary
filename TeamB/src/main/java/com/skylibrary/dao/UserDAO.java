package com.skylibrary.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.skylibrary.vo.SessionVO;
import com.skylibrary.vo.UserVO;

@Repository
public class UserDAO {

	@Inject
	SqlSession sql;
	
	private static final String namespace = "com.skylibrary.mappers.userMapper";
	
	public SessionVO login(SessionVO vo) throws Exception {
		return sql.selectOne(namespace + ".login", vo);
	}
	
	public void join(UserVO vo) throws Exception {
		sql.insert(namespace + ".join", vo);
	}
	
	public UserVO userInfo(UserVO vo) throws Exception {
		return sql.selectOne(namespace + ".userInfo", vo);
	}
	
}
