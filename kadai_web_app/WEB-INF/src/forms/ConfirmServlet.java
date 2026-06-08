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
		String userName = request.getParameter("name");
		String userEmail = request.getParameter("email");
		String usereAddress = request.getParameter("address");
		String usereTell = request.getParameter("phone_number");
		
		request.setAttribute( "name", userName );
		request.setAttribute( "email", userEmail );
		request.setAttribute( "address",  usereAddress );
		request.setAttribute( "phone_number", usereTell );
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/confirmPage.jsp");
    	dispatcher.forward(request, response);
			
}
}