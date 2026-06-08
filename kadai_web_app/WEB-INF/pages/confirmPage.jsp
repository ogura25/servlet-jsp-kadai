<%@ page contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		<title>フォーム作成課題</title>
	</head>
	<body>
		<h2>入力内容をご確認ください。</h2>
        <p>問題なければ「確定」、修正する場合は「キャンセル」をクリックしてください。</p>
        <table border="1">
			<tr>
		        <th>項目</th>
		        <th>入力内容</th>
        	</tr>
        	<tr>
		        <td>お名前</td>
		        <td>${name}</td>
        	</tr>
        	<tr>
		        <td>メールアドレス</td>
		        <td>${email}</td>
        	</tr>
        	<tr>
		        <td>住所</td>
		        <td>${address}</td>
        	</tr>
        	<tr>
		        <td>電話番号</td>
		        <td>${phone_number}</td>
        	</tr>
        	</table>
        
        <p>
	        <%-- 確定ボタン --%>
	        <button onclick="location.href='<%= request.getContextPath() %>/complete';">確定</button>
	    	<%-- キャンセルボタン --%>
	    	<button onclick="history.back();">キャンセル</button>
        </p>
     </body>
</html>