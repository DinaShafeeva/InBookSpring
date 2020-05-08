<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Edit page</title>
</head>
<body>
<h3>useeerыыыыыыыы</h3>

 <#list users as item>
 <p><strong class="d-block text-gray-dark">  ${item.getLogin()}</strong></p>
 <p>${item.getEmail()}</p>
 </#list>

<#--<ul>-->
    <#--<div th:each="user : ${users}">-->
        <#--<li th:text="'id = ' + ${user.id} +-->
        <#--', nickname = ' + ${user.nickname} + ', role = ' + ${user.role}"></li>-->
        <#--<form method="get" th:action="'user/' + ${user.id} + '/edit'">-->
            <#--<input type="submit" value="Edit">-->
        <#--</form>-->
        <#--<form method="post" th:action="'user/' + ${user.id} + '/delete'">-->
            <#--<input type="submit" value="Delete">-->
        <#--</form>-->
    <#--</div>-->
<#--</ul>-->
<#--<form method="get" action="/add">-->
    <#--<input type="submit" value="Add user">-->
<#--</form>-->
<#--<form method="get" th:action="'/users'">-->
    <#--<input name="filter" type="text">-->
    <#--<input type="submit" value="Filter"></form>-->
</body>
</html>