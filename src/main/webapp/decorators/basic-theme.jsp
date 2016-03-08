<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--<title>我的标题</title>--%>
    <title>my title</title>
    <meta charset="UTF-8">
</head>
<body>
<h1>header连连看</h1>
<p><b>Navigation</b></p>
<%--<img src="/sitemesh/decorators/logo.jpg" alt="logo" />--%>
<img src="${pageContext.request.contextPath}/decorators/logo.jpg" alt="logo"/>
<hr/>
<decorator:body/>
<hr/>
<h1>foot</h1>
</body>
</html>