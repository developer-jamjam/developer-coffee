<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>커피 한잔 할래요_?</title>
         <link rel="stylesheet" href="resources/css/style.css">
    </head>
    <body>
        <div class="wrap">
            <div class="form-wrap">
                <form id="ujoin" action="umemberJoin" class="input-group" method="POST">
                    <input type="text" class="input-field" placeholder="사용 할 ID 입력하세요" name="Upid" >
                    <input type="password" class="input-field" placeholder="사용 할 Password 입력하세요" name="Uppw" >
                    <input type="text" class="input-field" placeholder="이름을 입력해주세요" name="Upname" >
                   <input type="text" class="input-field" placeholder="핸드폰번호를 입력해주세요" name="Upphone">
                    <input type="text" class="input-field" placeholder="주소를 입력해주세요" name="Upaddress">
                    <input type="radio" value="User" name="Uptype">사용자</t>
                    <input type="radio" value="Business" name="Uptype">사업자<br>
                    <button class="submit">가입</button>
                </form>
            </div>
        </div>

    </body>
</html>