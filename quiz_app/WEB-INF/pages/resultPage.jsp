<%@ page contentType="text/html; charset=UTF-8" %>
<html lang="jp">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>フロントエンドクイズ</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css">
</head>
<body>
    <header>
        <div class="logo">
            <img src="<%= request.getContextPath() %>/images/logo.png" alt>
            
        </div>
    </header>
    <main>
        <article>
        
            <section id="quiz" class="result-container">
                <h1>🎉クイズ終了！🎉</h1>
                <p class="score-text">あなたのスコアは</p>
                <p id="score" class="score">${score}/5</p>
                <p class="message" id="message"></p>
                <button id="restartBtn" onclick  ="location.href='<%= request.getContextPath() %>/quiz';">もう一度挑戦する</button>
            </section>
          
        </article>
    </main>
    
</body>
</html>


