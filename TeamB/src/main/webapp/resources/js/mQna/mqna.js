function searchFn() {

//		var selectType    = document.getElementById("selectType").value;
//		var startDate     = document.getElementById("startDate").value;
//		var endDate       = document.getElementById("endDate").value;
			
		$.ajax({
			url: "/mqna/ajax/searchOk",
			type: "post",
			data: {
				selectType : $("#selectType").val(),
				startDate : $("#startDate").val(),
				endDate : $("#endDate").val()
			},
			error: function(){
				var str = "<h2><font color='orange'>오류</font></h2>";
				$("#result").html(str);
			}
			,
			success: function(data) {
				var str = "";
				
				for(var i=0; i<data.length; i++){
					
					str += "<tr id='tr_"+data[i].questionNo+"' onclick='viewFn("+data[i].questionNo+")'>";
					str += "	<td align='center' width='50'>"+data[i].questionNo+"</td>";
					str += "	<td width='600' style='padding-left: 8px;'><a href='javascript:viewFn("+data[i].questionNo+")'>"+data[i].questionTitle+"</a></td>";
					str += "	<td align='center' width='150'>"+data[i].userID+"</td>";
					str += "	<td align='center' width='200'>"+data[i].questionDate+"</td>";
					if(data[i].questionOkDate == null){ data[i].questionOkDate = ""; }
					if(data[i].questionType == "0"){ data[i].questionType = "<font color='blue'>답변대기</font></td>"; }
					if(data[i].questionType == "1"){ data[i].questionType = "<font color='orange'>답변완료</font></td>"; }
					str += "	<td align='center' width='200' id='okdate_"+data[i].questionNo+"'>"+data[i].questionOkDate+"</td>";
					str += "	<td align='center' width='200' id='atype_"+data[i].questionNo+"'>"+data[i].questionType+"</td>";
					str += "</tr>";
				}
					$("#result").html(str);
			}
		})
	}
	
	function viewFn(no) {
		$.ajax({
			url: "/mqna/ajax/detailOk",
			type: "post",
			data: {
				questionNo : no,
			},
			error:function(data){
				alert("error");
				console.log(data);
			
			},
			success: function(data) {

				var str = "";
				
				str += "<table border='1' class='viewTable'>";
				str += "	<thead>";
				str += "	<tr>";
				str += "		<th colspan='8'>질문상세정보</th>";
				str += "	</tr>";
				str += "	</thead>";
				str += "	<tbody>";
				str += "	<tr>";
				str += "		<th>질문번호</th>";
				str += "		<td>"+no+"</td>";
				str += "		<th>질문자</th>";
				str += "		<td>"+data.userID+"</td>";
				str += "		<th>질문일</th>";
				str += "		<td>"+data.questionDate+"</td>";
				str += "		<th>답변일</th>";
				if(data.questionOkDate == null){ data.questionOkDate = ""; }
				str += "		<td id='okdate'>"+data.questionOkDate+"</td>";
				str += "	</tr>";
				str += "	<tr>";
				str += "		<th>질문제목</th>";
				str += "		<td colspan='5'>"+data.questionTitle+"</td>";
				str += "		<th>질문상태</th>";
				if(data.questionType == 0) { 
					str += "		<td id='atype'>";
					str += "			<font color='blue'>답변대기</font>";
					str += "		</td>";
				}else{
					str += "		<td id='atype'>";
					str += "			<font color='orange'>답변완료</font>";
					str += "		</td>";
				}
				str += "	</tr>";
				str += "	<tr>";
				str += "		<th colspan='8'>질문내용</th>";
				str += "	</tr>";
				str += "	<tr>";
				str += "		<td colspan='8'>"+data.questionBody+"</td>";
				str += "	</tr>";
				str += "	<tr>"; 
				str += "		<th colspan='8'>답변상세정보</th>";
				str += "	</tr>";
				if(data.questionType == 0) { 
					str += "	<tr>";
					str += "		<th>답변제목</th>";
					str += "		<td colspan='7' id='a_title'>";
					str += "			<input type='text' size='50' id='title' placeholder='답변 제목을 입력해주세요.'>";
					str += "		</td>";	
					str += "	</tr>";
					str += "	<tr>";
					str += "		<th colspan='8'>답변내용</th>";
					str += "	</tr>";
					str += "	<tr>";
					str += "		<td colspan='8' id='a_body'>";
					str += "			<textarea id='body' placeholder='답변 내용을 입력해주세요.' cols='184' rows='10' style='resize: none;'></textarea>";
					str += " 		</td>";
					str += "	</tr>";
				}else{
					str += "	<tr>";
					str += "		<th>답변제목</th>";
					str += "		<td colspan='5' class='text' id='a_title'>"+data.answerTitle+"</td>";
					str += "		<th>작성자</th>";
					str += "		<td>"+data.managerID+"</td>";
					str += "	</tr>";
					str += "	<tr>";
					str += "		<th colspan='8'>답변내용</th>";
					str += "	</tr>";
					str += "	<tr><td class='text' id='a_body' colspan='8'>"+data.answerBody+"</td></tr>";
				}
				str += "	</tr>";
				if(data.questionType == 0) { 
					str += "<tr>";
					str += "	<td colspan='8' id='a_btn'>";
					str += "		<input type='button' value='등록' onclick='aInsertFn("+no+")'>";
					str += "	</td>";
					str += "</tr>";
				}else{
					str += "<tr>";
					str += "	<td colspan='8' id='a_btn'>";
					str += "		<input type='button' value='수정' onclick='aModifyFn("+no+")'>";
					str += "	</td>";
					str += "</tr>";
				}
				str += "	</tbody>";
				str += "</table>";
				
				$("#userInfoView").html(str);
			}
		})
	}
	
	function aInsertFn(no) {

		$.ajax({
			url: "/mqna/ajax/aInsertOk",
			type: "post",
			data: {
				answerTitle: $("#title").val(),
				answerBody : $("#body").val(),
				questionNo : no,
				managerID : "testManager"
			},
			error: function(){
				alert("ajax 오류가 발생하였습니다.");
			},
			success: function(data){
				$("#okdate").text(data.answerDate);
				$("#okdate_"+no).text(data.answerDate);
				$("#atype_"+no).html("<font color='orange'>답변완료</font>");
				$("#atype").html("<font color='orange'>답변완료</font>");
				$("#a_title").html(data.answerTitle);
				$("#a_body").html(data.answerBody);
				$("#a_btn").html("<input type='button' value='수정' class='a_button' onclick='aModifyFn("+no+")'>");
				alert("등록이 완료되었습니다.");
			}
		})
		
	}
	
	function aModifyFn(no) {
		var title = $("#a_title").text();
		var body  = $("#a_body").text();

		$("#a_title").html("<input type='text' id='title' class='input_text' size='50' value='"+title+"'>");
		$("#a_body").html("<textarea id='body' cols='190' rows='5' style='resize: none;'>"+body+"</textarea>"); 
		$("#a_btn").html("<input type='button' value='등록' class='a_button' onclick='aUpdateFn("+no+")'>");

	}
	
	function aUpdateFn(no) {
			
		$.ajax({
			url: "/mqna/ajax/aUpdateOk",
			type: "post",
			data: {
				questionNo: no,
				answerTitle: $("#title").val(),
				answerBody : $("#body").val()
			},
			error: function(){
				alert("DB 오류가 발생하였습니다. 다시 시도해주세요.");
			},
			success: function(data){
	
				$("#a_title").html(data.answerTitle);
				$("#a_body").html(data.answerBody);
				$("#a_btn").html("<input type='button' value='수정' class='a_button' onclick='aModifyFn("+no+")'>");
				
				alert("수정이 완료되었습니다.");
				
			}
		})
	}