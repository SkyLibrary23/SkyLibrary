<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.net.URLEncoder"%>
<%@ page session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�缭 ��õ ��������</title>
<link rel="stylesheet" href="../../../css/mCommon.css" type="text/css"/>
<link rel="stylesheet" href="../../../css/mrecommendView.css" type="text/css"/>
<script src="../../../js/jquery-3.5.1.min.js"></script>
<script>
	function InsertFn(){	
		var textVal = $("#recommend").val();
		var data = {
				recommend : textVal
		}
		
		$.ajax({
			url : "recommendInsert?isbn="+${bookView.bookISBN}+"",
			type : "post",
			data : $.param(data),
			success : function(result){
				var json = JSON.parse(result);
				var str = "";
				str += "<span id='titleSp_"+json[0]["no"]+"' style='display:inline-block;width:90%;'>" + json[0]["why"] + "</span><br><br>"
				str += "<span id='btnSp_"+json[0]["no"]+"'><button type='button' class='optionBox_btn_free'  onclick='modifyFn("+json[0]["no"]+")'>����</button> <button type='button' onclick='deleteFn("+json[0]["no"]+")'>����</button></span>"
				$("#recommend_box").html(str);
			}
		});	
	}
	
	
	function modifyFn(no){
		var titleVal = $("#titleSp_"+no).text();
		var str1 = "<textarea id='text_"+no+"' cols='100' rows='15'></textarea>";
		var str2 = "<button type='button' onclick='saveFn("+no+")'>����</button> <button  class='optionBox_btn_free' type='button' onclick='deleteFn("+no+")'>����</button>";
		$("#titleSp_"+no).html(str1);
		$("#btnSp_"+no).html(str2);
		$("#text_"+no).val(titleVal);
	}
	
	
	function saveFn(num){
		var textVal = $("#text_"+num).val();
		alert("!"+textVal);
		var data = {
				recommend : textVal,
				no    : num
		}
		$.ajax({
			url : "recommendUpdate?isbn="+${bookView.bookISBN}+"",
			type : "get",
			data : $.param(data), //"title=tttt&no=17"ó�� �Ķ���� ���ڿ��� ��������, $("form").serialize() ���� �ִ� ������ ���ڿ���, $("form").serializeArray()
			success : function(result){
				var json = JSON.parse(result); //json ��ü �����͸� �ڹٽ�ũ��Ʈ ��ü�� �������ִ� ����
				$("#titleSp_"+num).html(json[0]["why"]);
				
				var str = "<button type='button'  class='optionBox_btn_free' onclick='modifyFn("+num+")'>����</button>";
				$("#btnSp_"+num).html(str);
			}
		});
	}
	
	function deleteFn(num){
		if(confirm("��õ������ �����Ͻðڽ��ϱ�?") == true) {
			$.ajax({
				url : "recommendDelete.jsp?isbn="+${bookView.bookISBN}+"",
				type : "get",
				data : "no="+num,
				success : function(result){
					alert("�����Ͱ� �����Ǿ����ϴ�.");
					location.href = "recommendView.jsp?isbn="+${bookView.bookISBN}+"";
				}
			});
		}	
	}
</script>
</head>
<body style="margin: 0px;">
	<div class="wrap">
		<header>
			<div class="header">
				<div class="title_box"><span class="head_title">������ ������ </span><span class="name">�ϴõ�����</span></div>
			</div>
		</header>
		<section>
			<jsp:include page="../include/nav.jsp" />
			<div class="section">
				<div class="user_info">
				<span class="info_title"><span class="point">*</span>�缭 ��õ ����</span>				
				</div>
				<br>
				<br>	
				<div class="content">		
				<div class="searchview">
					<div class="searchview1">
						<table border="1" width="800px" style="border-collapse:collapse">
							<tr>
								<td colspan="3" align="center" height="50"><b><c:out value="${bookView.bookSubject}" /></b></td>
							</tr>
							<tr>
								<td rowspan="6" width="15%" align="center">
									<img src="<c:out value="${bookView.bookCoverImg}" />" alt="<c:out value="${bestView.bookSubject}" />" width="82px">
								</td>
								<th>����</th>
								<td><c:out value="${bookView.bookWriter}" /></td>
							</tr>
							<tr>
								<th>���ǻ�</th>
								<td><c:out value="${bookView.bookCompany}" /></td>							
							</tr>
							<tr>
								<th>������</th>
								<td><c:out value="${bookView.bookPublicationDate}" /></td>							
							</tr>
							<tr>
								<th>ISBN</th>
								<td><c:out value="${bookView.bookISBN}"/></td>							
							</tr>
							<tr>
								<th>������</th>
								<td>�ϴ� ������</td>							
							</tr>
						</table>
					</div>
					<br>
					<div class="searchview2">
					| ������
					<br>
					<br>
						<table border="1" width="800px" style="border-collapse:collapse">
							<tr>
								<td><c:out value="${bookView.bookStory}"/>
								</td>
							</tr>
						</table>
					</div>
					<br>
					<div class="searchview3">
					| ��õ����
					<br>
					<br>
					<table border="1" width="800px" style="border-collapse:collapse">
						<c:choose>  
						    <c:when test="${recommendWhy != null}">  
								<tr>
									<td>
										<span id="titleSp_${recommendNo}">${recommendWhy}</span>
										<br>
										<br>
										<span id="btnSp_${recommendNo}"><input type="button"  class="optionBox_btn_free" id="modify_btn" name="modify_btn" value="����" onclick="modifyFn(${recommendNo})">	
										<input type="button" id="delete_btn" name="delete_btn" value="����"  class="optionBox_btn_free" onclick="deleteFn(${recommendNo})"></span>	
									</td>
								</tr>  
						    </c:when>   
						    <c:otherwise>  
								<tr>
									<td id="recommend_box">
										<textarea id="recommend" name="recommend" cols="100" rows="15"></textarea>
										<input type="hidden" id="recommend_num" name="recommend_num" value="">
										<input type="button" id="insert_btn" name="insert_btn" value="���"  class="optionBox_btn_free" onclick="InsertFn()">
									</td>
								</tr>
						    </c:otherwise>  
						</c:choose> 													
					</table>
					</div>
				</div>
			</div>
			</div>
		</section>
	</div>
</body>
</html>