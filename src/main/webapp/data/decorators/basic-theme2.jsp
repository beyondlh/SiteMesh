<%--<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>--%>
<%--prefix可以自定义--%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="lhtest" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--<title>我的标题</title>--%>
    <title>my title</title>
    <meta charset="UTF-8">
</head>
<body>
<h1>头部</h1>
<p><b>我的测试</b></p>
<%--<img src="/sitemesh/decorators/logo.jpg" alt="logo" />--%>
<%--<img src="${pageContext.request.contextPath}/decorators/logo.jpg" alt="logo"/>--%>
<hr/>
<%--此处插入的就是要包装页面的body（可以是其他标签title head等）--%>
<lhtest:body/>
<hr/>
<h1>底部</h1>
</body>
</html>