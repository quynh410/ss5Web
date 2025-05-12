<%--
  Created by IntelliJ IDEA.
  User: MY PC
  Date: 12/05/2025
  Time: 5:05 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Update Category</title>
</head>
<body style="font-family: Arial, sans-serif; margin: 40px;">
<h3 style="color: #333;">Update Category</h3>
<form action="<%=request.getContextPath()%>/CategoriesController?action=Update" method="post" style="max-width: 400px; padding: 20px; border: 1px solid #ccc; border-radius: 8px; background-color: #f9f9f9;">
  <input type="hidden" name="catalogId" value="${catalog.cataId}" />

  <label for="catalogName" style="display: block; margin-bottom: 6px; font-weight: bold;">Category Name</label>
  <input type="text" id="catalogName" name="catalogName" value="${catalog.cataName}" style="width: 100%; padding: 8px; margin-bottom: 12px; border: 1px solid #ccc; border-radius: 4px;"/>

  <label for="description" style="display: block; margin-bottom: 6px; font-weight: bold;">Description</label>
  <input type="text" id="description" name="description" value="${catalog.cataDescription}" style="width: 100%; padding: 8px; margin-bottom: 12px; border: 1px solid #ccc; border-radius: 4px;"/>

  <label style="display: block; margin-bottom: 6px; font-weight: bold;">Status</label>
  <input type="radio" id="active" name="status" value="true" ${catalog.status ? 'checked' : ''}/>
  <label for="active" style="margin-right: 15px;">Active</label>

  <input type="radio" id="inActive" name="status" value="false" ${!catalog.status ? 'checked' : ''}/>
  <label for="inActive">Inactive</label><br><br>

  <input type="submit" value="Update" style="background-color: #007bff; color: white; padding: 10px 20px; border: none; border-radius: 4px; cursor: pointer;"/>
  <a href="<%=request.getContextPath()%>/CategoriesController?action=findAll" style="display: inline-block; padding: 10px 20px; background-color: #6c757d; color: white; text-decoration: none; border-radius: 4px; margin-left: 10px;">Cancel</a>
</form>
</body>
</html>