package com.skylibrary.vo;


public class NoticeVO extends SessionVO {
	private int noticeNo; //������ȣ
	private String noticeTitle; //��������
	private String noticeBody; //��������
	private String noticeDate; //������¥
	private int noticeHit; //���� ��ȸ��
	private String noticeFile; //÷������
	
	
	public int getNoticeNo() {
		return noticeNo;
	}
	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeBody() {
		return noticeBody;
	}
	public void setNoticeBody(String noticeBody) {
		this.noticeBody = noticeBody;
	}
	public int getNoticeHit() {
		return noticeHit;
	}
	public void setNoticeHit(int noticeHit) {
		this.noticeHit = noticeHit;
	}
	public String getNoticeFile() {
		return noticeFile;
	}
	public void setNoticeFile(String noticeFile) {
		this.noticeFile = noticeFile;
	}
	public String getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(String noticeDate) {
		//noticeDate �� timestamp �����̶�
		//yyyy-MM-dd hh:mm:ss ���·� ���� �޾ƿ�.
		//"����"�� �������� �߶� �迭�� �־��ش�.
		//array[0] = yyyy-MM-dd
		//array[1] = hh:mm:ss
		//array[0] = yyyy-MM-dd �� this.noticeDate�� �����Ѵ�.
		String[] array = noticeDate.split(" ");
		this.noticeDate = array[0];
	}
	@Override
	public String toString() {
		return "NoticeVO [noticeNo=" + noticeNo + ", noticeTitle=" + noticeTitle + ", noticeBody=" + noticeBody
				+ ", noticeDate=" + noticeDate + ", noticeHit=" + noticeHit + ", noticeFile=" + noticeFile
				+ ", getNoticeNo()=" + getNoticeNo() + ", getNoticeTitle()=" + getNoticeTitle() + ", getNoticeBody()="
				+ getNoticeBody() + ", getNoticeHit()=" + getNoticeHit() + ", getNoticeFile()=" + getNoticeFile()
				+ ", getNoticeDate()=" + getNoticeDate() + ", getUserID()=" + getUserID() + ", getUserPW()="
				+ getUserPW() + ", getCheck()=" + getCheck() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
