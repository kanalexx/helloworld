<%--
  Created by IntelliJ IDEA.
  User: kanal
  Date: 11.05.2021
  Time: 17:13
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Random Quote</title>
%{--    Подключение библиотеки jQuery --}%
    <asset:javascript src="jquery-3.3.1.min.js"/>
</head>

<body>
<ul id="menu">
    <li><g:remoteLink action="ajaxRandom" update="quote">
        Next Quote
    </g:remoteLink></li>
    <li><g:link action="index">
        Admin
    </g:link></li>
</ul>
<div id="quote">
    <q>${quote.content}</q>

    <p>${quote.author}</p>
</div>
</body>
</html>