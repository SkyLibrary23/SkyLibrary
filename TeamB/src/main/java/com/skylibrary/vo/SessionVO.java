package com.skylibrary.vo;

<<<<<<< HEAD
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SessionVO {
	private String userID;             
	private String userPW;            
	private String check;
	
//	public String getUserID() {
//		return userID;
//	}
//	public void setUserID(String userID) {
//		this.userID = userID;
//	}
//	public String getUserPW() {
//		return userPW;
//	}
//	public void setUserPW(String userPW) {
//		this.userPW = userPW;
//	}
//	public String getCheck() {
//		return check;
//	}
//	public void setCheck(String check) {
//		this.check = check;
//	}
//	
=======
public class SessionVO {
	private String userID;             //ȸ�� ���̵�
	private String userPW;             //��й�ȣ
	private String check;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	
>>>>>>> f9fdb124cc98c3afa245c33748a8230824d01e3d
}
