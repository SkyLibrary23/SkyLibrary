package com.skylibrary.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skylibrary.vo.BookVO;
import com.skylibrary.vo.RecommendVO;
import com.skylibrary.vo.SearchVO;

@Service
public interface RecommendService {
	public List<BookVO> list(SearchVO vo) throws Exception;
	
	public BookVO recommendView(String isbn) throws Exception;
	
	public int insertRbook(BookVO vo) throws Exception;
	
	public int updateRbook(RecommendVO vo) throws Exception;
	
	public int deleteRbook(RecommendVO vo) throws Exception;
}
