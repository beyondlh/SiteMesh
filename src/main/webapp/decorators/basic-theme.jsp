<?xml version="1.0" encoding="UTF-8" ?>

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <%--<title>我的标题</title>--%>
    <title>my title</title>
</head>
<body>
    <h1>header</h1>
    <p><b>Navigation</b></p>
    <%--<img src="/sitemesh/decorators/logo.jpg" alt="logo" />--%>
    <img src="${pageContext.request.contextPath}/decorators/logo.jpg" alt="logo" />
    <hr />
    <decorator:body />
    <hr />
    <h1>foot</h1>
</body>
</html>