<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%

	String id = (String)session.getAttribute("idKey");
	if(id == null){ id = ""; }

%>	
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		
		<title>������ ����</title>
		
		<link rel="stylesheet" href="/css/common.css" type="text/css"/>
		<link rel="stylesheet" href="/css/intro/calendar.css" type="text/css"/>
		
		<script src="/js/jquery-3.5.1.min.js"></script>
		<script src="/js/common.js"></script>
	</head>
	<body style="margin:0px">
		<div class="wrap"> 
			<header>
				<jsp:include page="../include/head_option.jsp" />
				<jsp:include page="../include/head_banner.jsp" />
			</header>
			<!-- header end -->
				
			<section id="section">
				<nav class="left_menu">
					<ul>
						<li class="left_menu_title">������ �Ұ�</li>
						<a href="/notice/"><li class="left_menu_sub">��������</li></a>
						<a href="/moveCalendar"><li class="on left_menu_sub">���� ����</li></a>
						<a href="/movePath"><li class="left_menu_sub last_sub">���ô� ��</li></a>
					</ul>
				</nav>
				<div class="section">
					<div class="section_top">
						<span class="top_title">���� ����</span>
						<span class="page_map">������ �Ұ� > ���� ����</span>
					</div>
					<div class="content">
					
						<div class="calendar">
							<h2><font color="orange">*</font>�޷�</h2>
							<img src="/image/homePage/12Calendar.jpg" width="700" alt="�ӽô޷�" style="margin-top:20px;">
						</div>
						<br>
						<br>
						<div class="info_box">
							<h2><font color="orange">*</font>�̴��� �������</h2>
							<ul class="info">
								<li>�۰����� ����(12��2�� ~ 12��13��)</li>
								<li>��� ���� ���Ⱑ�� �Ǽ� 5��->7��</li>
								<li>�츮���� ��ſ��� �������� ��ȸ</li>
							</ul>
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