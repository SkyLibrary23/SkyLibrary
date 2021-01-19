package com.skylibrary.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class NoticeVO extends SessionVO {
<<<<<<< HEAD
	private int noticeNo; //ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½È£
	private String noticeTitle; //ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½
	private String noticeBody; //ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½
	private String noticeDate; //ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Â¥
	private int noticeHit; //ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½È¸ï¿½ï¿½
	private String noticeFile; //Ã·ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½
	
//	
//	public int getNoticeNo() {
//		return noticeNo;
//	}
//	public void setNoticeNo(int noticeNo) {
//		this.noticeNo = noticeNo;
//	}
//	public String getManagerID() {
//		return managerID;
//	}
//	public void setManagerID(String managerID) {
//		this.managerID = managerID;
//	}
//	public String getNoticeTitle() {
//		return noticeTitle;
//	}
//	public void setNoticeTitle(String noticeTitle) {
//		this.noticeTitle = noticeTitle;
//	}
//	public String getNoticeBody() {
//		return noticeBody;
//	}
//	public void setNoticeBody(String noticeBody) {
//		this.noticeBody = noticeBody;
//	}
//	public String getNoticeDate() {
//		return noticeDate;
//	}
=======
	private int noticeNo; //°øÁö¹øÈ£
	private String noticeTitle; //°øÁöÁ¦¸ñ
	private String noticeBody; //°øÁö³»¿ë
	private String noticeDate; //°øÁö³¯Â¥
	private int noticeHit; //°øÁö Á¶È¸¼ö
	private String noticeFile; //Ã·ºÎÆÄÀÏ
	
	
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
	public String getNoticeDate() {
		return noticeDate;
	}
>>>>>>> f9fdb124cc98c3afa245c33748a8230824d01e3d
	public void setNoticeDate(String noticeDate) {
		//noticeDate ï¿½ï¿½ timestamp ï¿½ï¿½ï¿½ï¿½ï¿½Ì¶ï¿½
		//yyyy-MM-dd hh:mm:ss ï¿½ï¿½ï¿½Â·ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½Þ¾Æ¿ï¿½.
		//"ï¿½ï¿½ï¿½ï¿½"ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ß¶ï¿½ ï¿½è¿­ï¿½ï¿½ ï¿½Ö¾ï¿½ï¿½Ø´ï¿½.
		//array[0] = yyyy-MM-dd
		//array[1] = hh:mm:ss
		//array[0] = yyyy-MM-dd ï¿½ï¿½ this.noticeDateï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½Ñ´ï¿½.
		String[] array = noticeDate.split(" ");
		this.noticeDate = array[0];
	}
//	public int getNoticeHit() {
//		return noticeHit;
//	}
//	public void setNoticeHit(int noticeHit) {
//		this.noticeHit = noticeHit;
//	}
//	public String getNoticeFile() {
//		return noticeFile;
//	}
//	public void setNoticeFile(String noticeFile) {
//		this.noticeFile = noticeFile;
//	}
	
	
}
