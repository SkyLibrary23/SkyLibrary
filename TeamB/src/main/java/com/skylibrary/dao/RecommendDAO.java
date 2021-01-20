package com.skylibrary.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.skylibrary.vo.BookVO;
import com.skylibrary.vo.RecommendVO;

@Repository
public class RecommendDAO {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.skylibrary.mappers.recommendMapper";
	
	//���� ���� ���
	public List<BookVO> list() throws Exception {
		return sql.selectList(namespace + ".mRecommend");
	}
	
	//���� ��������
	public BookVO bookView(String isbn) throws Exception{
		return sql.selectOne(namespace + ".recommendView", isbn); 
	}
	
	//��õ ���
	public int insertRbook(BookVO vo) {
		return sql.insert(namespace + ".insertRbook", vo);
	}
	
	//��õ ����
	public int updateRbook(RecommendVO vo) {
		return sql.update(namespace + ".updateRbook", vo);
	}
	
	//��õ ����
	public int deleteRbook(RecommendVO vo) {
		return sql.delete(namespace + ".deleteRbook", vo);
	}
}
