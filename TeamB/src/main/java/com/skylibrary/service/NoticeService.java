package com.skylibrary.service;

import java.util.List;

import com.skylibrary.vo.NoticeVO;
import com.skylibrary.vo.PagingVO;
import com.skylibrary.vo.SearchVO;

public interface NoticeService {
	//main��  �������� ����Ʈ ���ϴ� �޼���
	public List<NoticeVO> MainList() throws Exception;
	
	//�˻��� �޾� �Խù� ��ȸ�ϴ� �޼���
	public List<NoticeVO> search(SearchVO vo) throws Exception;
	
	//����Ʈ ���� ���ϴ� �޼���
	public int countList(SearchVO vo) throws Exception;
	
	public NoticeVO view(NoticeVO vo) throws Exception;
	
	public List<NoticeVO> NoticeList(PagingVO vo) throws Exception;
	
	public void NoticeWrite(NoticeVO vo) throws Exception;
	
	public NoticeVO NoticeView(int noticeNo) throws Exception;
	
	public void NoticeModify(NoticeVO vo) throws Exception;
	
	public void NoticeDelete(int noticeNo) throws Exception;
	
	public int noticeCountList() throws Exception;
	
	public void updateHit(int noticeNo) throws Exception;
 }
