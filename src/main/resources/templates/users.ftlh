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

</body>
</html>