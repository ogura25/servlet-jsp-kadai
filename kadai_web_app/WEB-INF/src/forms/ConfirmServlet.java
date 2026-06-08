package forms;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfirmServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		
		 request.setCharacterEncoding("UTF-8");

		//フォームに入力されたjspから送信されたデータ取得（"パラメータ名"）
		String userName = request.getParameter("user_name");
		String userEmail = request.getParameter("user_email");
		String usereAdress = request.getParameter("user_adress");
		String usereTell = request.getParameter("user_tell");
		
		request.setAttribute( "name", userName );
		request.setAttribute( "email", userEmail );
		request.setAttribute( "adress",  usereAdress );
		request.setAttribute( "tell", usereTell );
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/confirmPage.jsp");
    	dispatcher.forward(request, response);
			
}
}