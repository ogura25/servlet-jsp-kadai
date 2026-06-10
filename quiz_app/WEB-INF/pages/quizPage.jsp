<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
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
        <form action = "<%= request.getContextPath() %>/quiz" method = "post">
        <input type = "hidden" name= "quizCount" value = "${quizCount}">
        <input type="hidden" name="score" value="${score}">
            <section id="quiz" class="container">
                <h1>フロントエンドクイズ</h1>
                <P id="progress">${quizCount}/5</P>
                <h2 id="question">${question}</h2>
                <div id="choices">
                    
                    <label class="choice">
                        <input type="radio" name="op" value= "0">
                        ${choice[0]}
                    </label>
                    <label class="choice">
                         <input type="radio" name="op" value= "1" >
                       ${choice[1]}
                    </label>
                    <label class="choice">
                         <input type="radio" name="op" value="2">
                       ${choice[2]}
                    </label>
                  
                </div>
                <p id="result"></p>
                <button id="checkBtn" type="button">回答する</button>
                <button id="nextBtn" type="submit" >次へ</button>
            </section>
            </form>
        </article>
    </main>
</body>
</html>