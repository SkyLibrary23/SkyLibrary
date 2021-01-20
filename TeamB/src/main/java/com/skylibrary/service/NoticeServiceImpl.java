package com.skylibrary.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.skylibrary.dao.NoticeDAO;
import com.skylibrary.vo.NoticeVO;
import com.skylibrary.vo.PagingVO;
import com.skylibrary.vo.SearchVO;

@Service
public class NoticeServiceImpl implements NoticeService {

	
	@Inject
	NoticeDAO dao;
	
	@Override
	public List<NoticeVO> MainList() throws Exception {
		return dao.MainList();
	}

	@Override
	public List<NoticeVO> search(SearchVO vo) throws Exception {
		return dao.list(vo);
	}

	@Override
	public int countList(SearchVO vo) throws Exception {
		return dao.countList(vo);
	}

	@Override
	public NoticeVO view(NoticeVO vo) throws Exception {
		return dao.view(vo);
	}
	
	//�缭 �������� ���
	@Override
	public List<NoticeVO> NoticeList(PagingVO vo) throws Exception{
		return dao.NoticeList(vo);
	}
		
	//�缭 �������� �ۼ�
	@Override
	public void NoticeWrite(NoticeVO vo) throws Exception{
		dao.NoticeWrite(vo);
	}
	
	//�缭 �������� ��ȸ
	@Override
	public NoticeVO NoticeView(int noticeNo) throws Exception{
		return dao.NoticeView(noticeNo);
	}
	
	//�缭 �������� ����
	@Override
	public void NoticeModify(NoticeVO vo) throws Exception {
		dao.NoticeModify(vo);
	}

	//�缭 �������� ����
	@Override
	public void NoticeDelete(int noticeNo) throws Exception {
		dao.NoticeDelete(noticeNo);
	}
	
	//�缭 �������� ����¡
	@Override
	public int noticeCountList() throws Exception {
		return dao.noticeCountList();
	}

	//�缭 �������� ��ȸ��
	@Override
	public void updateHit(int noticeNo) throws Exception {
		dao.updateHit(noticeNo);	
	}
}
