<%@ page language="java" import="java.util.*" contentType="text/html; CHARSET=utf-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
    <h1>
        前端编码 parameter:
        <%=
        request.getParameter("name1")
        %>
        前端编码 decode:
        <%=
        request.getAttribute("name1")
        %>
        前端不编码 parameter:
        <%=
        request.getParameter("name1")
        %>
        前端不编码 decode:
        <%=
        request.getAttribute("name1")
        %>
    </h1>
</body>
<script charset="utf-8" src="//g.alicdn.com/sj/lib/jquery/dist/jquery.min.js"></script>
<script charset="utf-8">

</script>
</html>