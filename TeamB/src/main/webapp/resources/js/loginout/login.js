<<<<<<< HEAD
//회원 로그인
=======

<<<<<<< HEAD
 	//ȸ�� �α���
>>>>>>> f9fdb124cc98c3afa245c33748a8230824d01e3d
 	function login(){
 		
 		if($("input:text").val() == ""){
			alert("아이디를 입력하세요.");
			$("input:text").focus();
			return false;
		}else if($("input:password").val() == ""){
<<<<<<< HEAD
			alert("비밀번호를 입력하세요.");
=======
			alert("��й�ȣ�� �Է��ϼ���.");
=======
 	//회원 로그인
 	function login(){
 		
 		if($("input:text").val() == ""){
			alert("아이디를 입력하세요.");
			$("input:text").focus();
			return false;
		}else if($("input:password").val() == ""){
			alert("비밀번호를 입력하세요.");
>>>>>>> 210115
>>>>>>> f9fdb124cc98c3afa245c33748a8230824d01e3d
			$("input:password").focus();
			return false;
		}else{
			document.login_frm.submit();
		}
 		
 	}
 	
<<<<<<< HEAD
 	//사서 로그인
=======
<<<<<<< HEAD
 	//�缭 �α���
>>>>>>> f9fdb124cc98c3afa245c33748a8230824d01e3d
 	function login2(){
 		
 		if($("input:text").val() == ""){
			alert("아이디를 입력하세요.");
			$("input:text").focus();
			return false;
		}else if($("input:password").val() == ""){
<<<<<<< HEAD
			alert("비밀번호를 입력하세요.");
=======
			alert("��й�ȣ�� �Է��ϼ���.");
=======
 	//사서 로그인
 	function login2(){
 		
 		if($("input:text").val() == ""){
			alert("아이디를 입력하세요.");
			$("input:text").focus();
			return false;
		}else if($("input:password").val() == ""){
			alert("비밀번호를 입력하세요.");
>>>>>>> 210115
>>>>>>> f9fdb124cc98c3afa245c33748a8230824d01e3d
			$("input:password").focus();
			return false;
		}else{
			document.login_frm2.submit();
		}
 		
 	}
 
 	
<<<<<<< HEAD
 	//사서 로그인 화면으로 전환
	var m_LoginStr ='<h2 class="login_title">사서 로그인</h2>                                                                                         '
		+'<div class="login_input_box">                                                                                                               '
		+'	<form action="/mloginout/loginOk" method="post" name="login_frm2">                                                      '
		+'		<table>                                                                                                                               '
		+'			<tr height="50" class="login_txt">                                                                                                '
		+'				<td width="100" align="right" class="login_input"><span class="point id">*</span><span class="id_title">아이디</span>:</td>     '
		+'				<td width="300"><input type="text" class="input" name="userID" size="38" placeholder=" 아이디를 입력해주세요."></td>                    '
=======
<<<<<<< HEAD
 	//�缭 �α��� ȭ������ ��ȯ
	var m_LoginStr ='<h2 class="login_title">�缭 �α���</h2>                                                                                         '
=======
 	//사서 로그인 화면으로 전환
	var m_LoginStr ='<h2 class="login_title">사서 로그인</h2>                                                                                         '
>>>>>>> 210115
		+'<div class="login_input_box">                                                                                                               '
		+'	<form action="/User/loginout/mlogin" method="post" name="login_frm2">                                                      '
		+'		<table>                                                                                                                               '
		+'			<tr height="50" class="login_txt">                                                                                                '
<<<<<<< HEAD
		+'				<td width="100" align="right" class="login_input"><span class="point id">*</span><span class="id_title">���̵�</span>:</td>     '
		+'				<td width="300"><input type="text" class="input" name="id" size="38" placeholder=" ���̵� �Է����ּ���."></td>                    '
>>>>>>> f9fdb124cc98c3afa245c33748a8230824d01e3d
		+'			</tr>                                                                                                                             '
		+'			<tr height="50" class="login_txt">                                                                                                '
		+'				<td align="right" class="login_input"><span class="point">*</span>비밀번호:</td>                                                '
		+'				<td><input type="password" name="userPW"  class="input" size="38" placeholder=" 비밀번호를 입력해주세요."></td>                         '
		+'			</tr>                                                                                                                             '
		+'			<tr class="login_option">                                                                                                         '
		+'				<td colspan="2" align="center">                                                                                               '
		+'					<a href="#">아이디/비밀번호찾기</a>                                                                                       	  '
		+'					<font color="#2C78D7">&nbsp;|&nbsp;</font>                                                                                '
		+'					<a href="/mjoin">회원가입</a>                                                                                      '
		+'					<font color="#2C78D7">&nbsp;|&nbsp;</font>                                                                                '
<<<<<<< HEAD
		+'					<a href="javascript:u_login()">회원 로그인</a>                                                                               '
=======
		+'					<a href="javascript:u_login()">ȸ�� �α���</a>                                                                               '
=======
		+'				<td width="100" align="right" class="login_input"><span class="point id">*</span><span class="id_title">아이디</span>:</td>     '
		+'				<td width="300"><input type="text" class="input" name="userID" size="38" placeholder=" 아이디를 입력해주세요."></td>                    '
		+'			</tr>                                                                                                                             '
		+'			<tr height="50" class="login_txt">                                                                                                '
		+'				<td align="right" class="login_input"><span class="point">*</span>비밀번호:</td>                                                '
		+'				<td><input type="password" name="userPW" class="input" size="38" placeholder=" 비밀번호를 입력해주세요."></td>                         '
		+'			</tr>                                                                                                                             '
		+'			<tr class="login_option">                                                                                                         '
		+'				<td colspan="2" align="center">                                                                                               '
		+'					<a href="#">아이디/비밀번호찾기</a>                                                                                       	  '
		+'					<font color="#2C78D7">&nbsp;|&nbsp;</font>                                                                                '
		+'					<a href="/User/join/mjoin">회원가입</a>                                                                                      '
		+'					<font color="#2C78D7">&nbsp;|&nbsp;</font>                                                                                '
		+'					<a href="javascript:u_login()">회원 로그인</a>                                                                               '
>>>>>>> 210115
>>>>>>> f9fdb124cc98c3afa245c33748a8230824d01e3d
		+'				</td>                                                                                                                         '
		+'			</tr>                                                                                                                             '
		+'			<tr height="70">                                                                                                                  '
		+'				<td colspan="2" align="center">                                                                                               '
<<<<<<< HEAD
		+'					<button type="button" class="login_btn" onclick="login2()" >로그인</button>                                                '
=======
<<<<<<< HEAD
		+'					<button type="button" class="login_btn" onclick="login2()" >�α���</button>                                                '
=======
		+'					<button type="button" class="login_btn" onclick="login2()" >로그인</button>                                                '
>>>>>>> 210115
>>>>>>> f9fdb124cc98c3afa245c33748a8230824d01e3d
		+'				</td>                                                                                                                         '
		+'			</tr>                                                                                                                             '
		+'		</table>                                                                                                                              '
		+'	</form>                                                                                                                                   '
		+'</div>                                                                                                                                      '
		
		function m_login(){
			$(".login_box").html(m_LoginStr);
		}
		
		
<<<<<<< HEAD
		//회원 로그인 화면으로 전환
		var u_LoginStr ='<h2 class="login_title">로그인</h2>                                                                                         '
=======
<<<<<<< HEAD
		//ȸ�� �α��� ȭ������ ��ȯ
		var u_LoginStr ='<h2 class="login_title">�α���</h2>                                                                                         '
=======
		//회원 로그인 화면으로 전환
		var u_LoginStr ='<h2 class="login_title">로그인</h2>                                                                                         '
>>>>>>> 210115
>>>>>>> f9fdb124cc98c3afa245c33748a8230824d01e3d
			+'<div class="login_input_box">                                                                                                               '
			+'	<form action="/loginout/loginOk" method="post" name="login_frm">                                                      '
			+'		<table>                                                                                                                               '
			+'			<tr height="50" class="login_txt">                                                                                                '
<<<<<<< HEAD
			+'				<td width="100" align="right" class="login_input"><span class="point id">*</span><span class="id_title">아이디</span>:</td>     '
			+'				<td width="300"><input type="text" class="input" name="userID" size="38" placeholder=" 아이디를 입력해주세요."></td>                    '
=======
<<<<<<< HEAD
			+'				<td width="100" align="right" class="login_input"><span class="point id">*</span><span class="id_title">���̵�</span>:</td>     '
			+'				<td width="300"><input type="text" class="input" name="id" size="38" placeholder=" ���̵� �Է����ּ���."></td>                    '
>>>>>>> f9fdb124cc98c3afa245c33748a8230824d01e3d
			+'			</tr>                                                                                                                             '
			+'			<tr height="50" class="login_txt">                                                                                                '
			+'				<td align="right" class="login_input"><span class="point">*</span>비밀번호:</td>                                                '
			+'				<td><input type="password" name="userPW"  class="input" size="38" placeholder=" 비밀번호를 입력해주세요."></td>                         '
			+'			</tr>                                                                                                                             '
			+'			<tr class="login_option">                                                                                                         '
			+'				<td colspan="2" align="center">                                                                                               '
			+'					<a href="#">아이디/비밀번호찾기</a>                                                                                       	  '
			+'					<font color="#2C78D7">&nbsp;|&nbsp;</font>                                                                                '
			+'					<a href="/join">회원가입</a>                                                                                      '
			+'					<font color="#2C78D7">&nbsp;|&nbsp;</font>                                                                                '
<<<<<<< HEAD
			+'					<a href="javascript:m_login()">사서 로그인</a>                                                                                       '
=======
			+'					<a href="javascript:m_login()">�缭 �α���</a>                                                                                       '
=======
			+'				<td width="100" align="right" class="login_input"><span class="point id">*</span><span class="id_title">아이디</span>:</td>     '
			+'				<td width="300"><input type="text" class="input" name="id" size="38" placeholder=" 아이디를 입력해주세요."></td>                    '
			+'			</tr>                                                                                                                             '
			+'			<tr height="50" class="login_txt">                                                                                                '
			+'				<td align="right" class="login_input"><span class="point">*</span>비밀번호:</td>                                                '
			+'				<td><input type="password" name="pw"  class="input" size="38" placeholder=" 비밀번호를 입력해주세요."></td>                         '
			+'			</tr>                                                                                                                             '
			+'			<tr class="login_option">                                                                                                         '
			+'				<td colspan="2" align="center">                                                                                               '
			+'					<a href="#">아이디/비밀번호찾기</a>                                                                                       	  '
			+'					<font color="#2C78D7">&nbsp;|&nbsp;</font>                                                                                '
			+'					<a href="/User/join/join">회원가입</a>                                                                                      '
			+'					<font color="#2C78D7">&nbsp;|&nbsp;</font>                                                                                '
			+'					<a href="javascript:m_login()">사서 로그인</a>                                                                                       '
>>>>>>> 210115
>>>>>>> f9fdb124cc98c3afa245c33748a8230824d01e3d
			+'				</td>                                                                                                                         '
			+'			</tr>                                                                                                                             '
			+'			<tr height="70">                                                                                                                  '
			+'				<td colspan="2" align="center">                                                                                               '
<<<<<<< HEAD
			+'					<button type="button" class="login_btn" onclick="login()" >로그인</button>                                                    '
=======
<<<<<<< HEAD
			+'					<button type="button" class="login_btn" onclick="login()" >�α���</button>                                                    '
=======
			+'					<button type="button" class="login_btn" onclick="login()" >로그인</button>                                                    '
>>>>>>> 210115
>>>>>>> f9fdb124cc98c3afa245c33748a8230824d01e3d
			+'				</td>                                                                                                                         '
			+'			</tr>                                                                                                                             '
			+'		</table>                                                                                                                              '
			+'	</form>                                                                                                                                   '
			+'</div>      																																'
			
			function u_login(){
				$(".login_box").html(u_LoginStr);
			}