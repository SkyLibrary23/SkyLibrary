<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	
	<title>통합검색 상세정보</title>
	
		<link rel="stylesheet" href="/css/common.css" type="text/css"/>
		<link rel="stylesheet" href="/css/search/bookView.css" type="text/css"/>
	
		<script src="/js/jquery-3.5.1.min.js"></script>
		<script src="/js/common.js"></script>
		<script src="/js/search/bookView.js"></script>
</head>
<body style="margin:0px">
	
	<div class="wrap"> 
		<header>
			<jsp:include page="../include/head_option.jsp"/>
			<jsp:include page="../include/head_banner.jsp"/>
		</header>
		<!-- header end -->
	
		<section id="section">
			<nav class="left_menu">
				<ul>
					<li class="left_menu_title">도서검색</li>
					<a href="/User/search/total"><li class="on left_menu_sub">통합검색</li></a>
					<a href="/User/search/best"><li class="left_menu_sub">인기도서</li></a>
					<a href="/User/search/new"><li class="left_menu_sub">신착도서</li></a>
					<a href="/User/search/recommend"><li class="left_menu_sub last_sub">사서추천도서</li></a>
				</ul>
			</nav>
			<div class="section">
				<div class="section_top">
					<span class="top_title">통합검색</span>
					<span class="page_map">도서검색 > 통합 검색</span>
				</div>
					<div class="content">
						<div class="searchview">
							<br>
							<br>
							<input type="hidden" value="${user.userID}" id="session_id">
							<div class="searchview1">
								<table width="800px" class="viewTable" >
									<tr height="80px;">
										<td colspan="3" align="center" height="50" class="view_td">
											<h2>&lt;&lt;&nbsp;&nbsp; <c:out value="${bookView.bookSubject}" /> &nbsp;&nbsp;&gt;&gt;</h2>
										</td>
									</tr>
									<tr class="tr">
										<td rowspan="6" width="15%" align="center" class="imgtd">
											<img src="<c:out value="${bookView.bookCoverImg}" />" alt="<c:out value="${bestView.bookSubject}" />" width="82px">
										</td>
										<th>저자</th>
										<td><c:out value="${bookView.bookWriter}" /></td>
									</tr>
									<tr class="tr">
										<th>출판사</th>
										<td><c:out value="${bookView.bookCompany}" /></td>							
									</tr>
									<tr class="tr">
										<th>발행일</th>
										<td><c:out value="${bookView.bookPublicationDate}" /></td>							
									</tr>
									<tr class="tr">
										<th>ISBN</th>
										<td><c:out value="${bookView.bookISBN}"/></td>							
									</tr>
									<tr class="tr lasttd">
										<th>소장기관</th>
										<td>하늘 도서관</td>							
									</tr>
								</table>
							</div>
							<br>
							<div class="searchview2">
							<h3><font color="orange">*</font>상세정보</h3>
								<div class="storyDiv">
									<c:out value="${bookView.bookStory}"/>
								</div>
							</div>
							<br>
							<div class="searchview3">
							<h3><font color="orange">*</font>소장정보</h3>
							<form><input type="hidden" ></form>
								<table class="viewTable" width="800">
									<tr height="40px">
										<th width="30%" class="view_td">자료상태</th>
										<th width="30%" class="view_td">반납예정일</th>
										<th width="30%" class="view_td">대출</th>
									</tr>
									<c:choose>
										<c:when test="${bookView.bookRent == 0}" >
										<tr height="40px">
											<td class="lasttd" align="center" id="rent1">대출가능 (비치중)</td>
											<td class="lasttd" align="center" id="rent2"></td>
											<td class="lasttd" align="center" id="rent3">
												<c:choose>							
													<c:when test="${user.userID == null}">
														<input type="button" value="대출하기" class="rentbtn" onclick="alert('로그인 후 이용 가능한 서비스 입니다.')">
													</c:when>
													<c:when test="${user.userID != null}">
														<input type="button" value="대출하기" class="rentbtn" onclick="rentFn('<c:out value="${bookView.bookISBN}"/>', <c:out value="${cnt}" />)">
													</c:when>
												</c:choose>	
											</td>
										</tr>
										</c:when> 
										<c:when test="${bookView.bookRent == 1}">
											<tr height="40px">
												<td class="lasttd" align="center">대출불가(대출중)</td>
												<td class="lasttd" align="center"><c:out value="${bookView.rentEndDate}"/></td>
												<td class="lasttd" align="center"><input type="button" value="대출완료" class="rentbtn" disabled></td>
											</tr>									
										</c:when>
									</c:choose>
								</table>
							</div>
							<br>
							<br>
							<button type="button" onclick="location.href='total'" class="listbtn">목록으로</button>
						</div>
					</div>
			</div>
		</section>
		<!-- section end -->
		
		<jsp:include page="../include/footer.jsp" />
		<!-- footer end -->
		
	</div>
</body>
</html>