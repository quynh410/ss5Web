

<%--
  Created by IntelliJ IDEA.
  User: MY PC
  Date: 12/05/2025
  Time: 5:05 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Categories</title>
</head>
<body style="font-family: Arial, sans-serif; margin: 40px;">

<h3 style="color: #333;">List Categories</h3>

<table border="1" style="border-collapse: collapse; width: 100%; max-width: 900px; margin-bottom: 20px;">
    <thead>
    <tr style="background-color: #f2f2f2;">
        <th style="padding: 10px; border: 1px solid #ddd;">No</th>
        <th style="padding: 10px; border: 1px solid #ddd;">Catalog Id</th>
        <th style="padding: 10px; border: 1px solid #ddd;">Catalog Name</th>
        <th style="padding: 10px; border: 1px solid #ddd;">Descriptions</th>
        <th style="padding: 10px; border: 1px solid #ddd;">Status</th>
        <th style="padding: 10px; border: 1px solid #ddd;">Actions</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach  items="${listCategories}" var="catalog" varStatus="loop">
        <tr>
            <td style="padding: 8px; border: 1px solid #ddd;">${loop.index + 1}</td>
            <td style="padding: 8px; border: 1px solid #ddd;">${catalog.cataId}</td>
            <td style="padding: 8px; border: 1px solid #ddd;">${catalog.cataName}</td>
            <td style="padding: 8px; border: 1px solid #ddd;">${catalog.cata_depscription}</td>
            <td style="padding: 8px; border: 1px solid #ddd;">${catalog.status}</td>
            <td style="padding: 8px; border: 1px solid #ddd;">
                <a href="<%=request.getContextPath()%>/CategoriesController?catalogId=${catalog.catalogId}&&action=initUpdate"
                   style="margin-right: 10px; color: #007bff; text-decoration: none;">Update</a>
                <a href="<%=request.getContextPath()%>/CategoriesController?catalogId=${catalog.catalogId}&&action=delete"
                   style="color: #dc3545; text-decoration: none;">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<a href="views/newCatalog.jsp" style="display: inline-block; padding: 10px 15px; background-color: #28a

