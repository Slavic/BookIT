<%-- 
    Document   : header
    Created on : 19.04.2014, 15:59:33
    Author     : Holger Szuesz <hszuesz@live.com>
--%>

<%@tag description="Custom header tag for page framework" pageEncoding="UTF-8"%>

<%-- any content can be specified here e.g.: --%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width">

<link rel="stylesheet" href="/BookIT/css/main.css" />
<link rel="stylesheet" href="/BookIT/js/libs/jqueryui/css/base/jquery.ui.all.css" />

<title>BookIT - <%=request.getAttribute("strTitle")%></title>