<%--
  Created by IntelliJ IDEA.
  User: ngoke
  Date: 3/14/2024
  Time: 6:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>VnPay</title>
</head>
<body>
    <form method="post" action="<%=request.getContextPath()%>/vnpay">
        <input type="text" name="vnp_OrderInfo">
        <input type="text" name="ordertype">
        <input type="submit" style="background-color: aquamarine">
    </form>
    <div id="content">

    </div>
    <button id="btn" style="background-color: aquamarine;cursor: pointer"></button>
</body>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
    $(document).ready(function(){
        $("#btn").click(function (){
            $.ajax({
                url:'test.jsp',
                type:'GET',
                dataType:'html',
                success:function(response){
                    document.getElementById("content").innerHTML+=response
                }
            })
        })
    })
</script>
</html>
