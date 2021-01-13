<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		
		<title>�α���</title>
		
		<link rel="stylesheet" href="/css/mainCommon.css" type="text/css"/>
		<link rel="stylesheet" href="/css/loginout/loginoutSection.css" type="text/css"/>
		
		<script src="/js/jquery-3.5.1.min.js"></script>
		<script src="/js/loginout/login.js"></script>
	</head>
	<body style="margin:0px">
		<div class="wrap"> 
			<header>
				<div class="head_option">
					<div class="rightnow">
						<a href="#section"><span class="rightnow_click">���� �ٷΰ���</span></a>
					</div>
					<div class="head_btns">
						<input class="head_btn" type="button" value="�α���" onclick="location.href='login.jsp'">
						<input class="head_btn" type="button" value="ȸ������" onclick="location.href='../join/join.jsp'">
					</div>
				</div>
				<jsp:include page="../include/head_banner.jsp" />
			</header>
			<!-- header end -->
		
		<section id="section">
			<div class="section">
				<div class="login_box">
				<h2 class="login_title">�α���</h2>
					<div class="login_input_box">
						<form action="loginProc.jsp" method="post" name="login_frm">
							<table>
								<tr height="50" class="login_txt">
									<td width="100" align="right" class="login_input"><span class="point id">*</span><span class="id_title">���̵�</span>:</td>
									<td width="300"><input type="text" class="input" name="id" size="38" placeholder=" ���̵� �Է����ּ���."></td>
								</tr>
								<tr height="50" class="login_txt">
									<td align="right" class="login_input"><span class="point">*</span>��й�ȣ:</td>
									<td><input type="password" name="pw"  class="input" size="38" placeholder=" ��й�ȣ�� �Է����ּ���."></td>
								</tr>
								<tr class="login_option">
									<td colspan="2" align="center">
										<a href="#">���̵�/��й�ȣã��</a>
										<font color="#2C78D7">&nbsp;|&nbsp;</font>
										<a href="../join/join.jsp">ȸ������</a>
										<font color="#2C78D7">&nbsp;|&nbsp;</font>
										<a href="javascript:m_login()">�缭 �α���</a>
									</td>
								</tr>
								<tr height="70">
									<td colspan="2" align="center">
										<button type="button" class="login_btn" onclick="login()" >�α���</button>
									</td>
								</tr>
							</table>
						</form>
					</div>
				</div>
			</div>
		</section>
		<!-- section end -->
		
		<jsp:include page="../include/footer.jsp"/>
		<!-- footer end -->
		
		</div>
	</body>
</html>