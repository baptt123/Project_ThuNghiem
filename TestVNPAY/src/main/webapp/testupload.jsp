<%--
  Created by IntelliJ IDEA.
  User: ngoke
  Date: 4/9/2024
  Time: 6:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload anh</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/testupload" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="accept">
</form>
</body>
</html>
