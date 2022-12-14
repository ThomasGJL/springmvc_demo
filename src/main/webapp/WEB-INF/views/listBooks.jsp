<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring5 MVC Hibernate Demo</title>
    <style type="text/css">
        .error {
            color: red;
        }
        table {
            width: 50%;
            border-collapse: collapse;
            border-spacing: 0px;
        }
        table td {
            border: 1px solid #565454;
            padding: 20px;
        }
    </style>
</head>
<body>

<h2>Book List</h2>
<table>
    <tr>
        <td><strong>Name</strong></td>
        <td><strong>Author</strong></td>
    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.name}</td>
            <td>${book.author}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

