package quiz;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//フィールドに問題文と選択肢がはいった変数を用意する
public class QuizServlet extends HttpServlet {

    String[] questions = {
        "配列の各要素に0から順番に振られている番号のことを何という？",
        "クラスをもとに作られたオブジェクトのことを何という？",
        "インスタンス生成時に初期化処理を行う関数のことを何という？",
        "インスタンスや通常のオブジェクトが持つ関数のことを何という？",
        "JavaScriptでサーバーと非同期通信を行う手法を何という？"
    };

    String[][] choices = {
        {"プロパティ", "キー", "インデックス"},
        {"クラス", "インスタンス", "メソッド"},
        {"コンストラクタ", "メソッド", "プロパティ"},
        {"プロパティ", "メソッド", "インスタンス"},
        {"DOM", "JSON", "Ajax"}
    };
    
    String[] answers = {"2","1","0","1","2",
           
       };
    
    
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		
		
		
		
		//JSPに現在の問題番号を渡す
		request.setAttribute("quizCount", 1);
		request.setAttribute("score", 0);
		
		request.setAttribute("question",questions[0]);
		request.setAttribute("choice",choices[0]);
		request.setAttribute("answer",answers[0]);
		
		
	
		//画面遷移
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/quizPage.jsp");
		dispatcher.forward(request, response);
		}


public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
		int quizCount =
		    Integer.parseInt(request.getParameter("quizCount"));

		int score =
		    Integer.parseInt(request.getParameter("score"));

		String userChoice =
		    request.getParameter("op");
        
		// 選択した値と正解を比較
        if (userChoice.equals(answers[quizCount - 1])) {

            // 正解なら正解数を1増やす
            score++;
        }

        // 次の問題へ進める
        quizCount++;

        //問題数が５になったらresultPage.jspに遷移するif文
        if(quizCount >=5) {
        	request.setAttribute("score", score);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/resultPage.jsp");
	        dispatcher.forward(request, response);
	        return;
       
        }
        	
        // 現在の問題番号をJSPへ渡す
        request.setAttribute("quizCount", quizCount);

        // 現在の正解数をJSPへ渡す
        request.setAttribute("score", score);

        // 次の問題文をJSPへ渡す
        request.setAttribute("question", questions[quizCount - 1]);

        // 次の選択肢をJSPへ渡す
        request.setAttribute("choice", choices[quizCount - 1]);
        
         
        RequestDispatcher dispatcher2 = request.getRequestDispatcher("/WEB-INF/pages/quizPage.jsp");
        dispatcher2.forward(request, response);

}
}