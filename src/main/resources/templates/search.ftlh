<!doctype html>
<#include "menu.ftlh">

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>

<body>
<div class="container">
<form  class="form-inline my-2 ">
    <div style="alignment: center">
    <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-warning my-2 my-sm-0" type="submit">Search</button>
    </div>
</form>

<div class="my-3 p-3 bg-white container rounded shadow-sm">
<#list booksList as item>
        <div id=${item.getIdBook()} class="media text-muted pt-3" >
            <p id="booksSvg" > <svg class="bd-placeholder-img mr-2 rounded"  width="32" height="32" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 32x32"><title>Placeholder</title><rect width="100%" height="100%" fill="#d69c4b"></rect></svg></p>
            <p id="books" class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray" >
                <strong class="d-block text-gray-dark">${item.nameOfBook}</strong>
                ${item.author}

        <form  action="/search" method="post">
        <small class="d-block text-right mt-3">
            <input  type="submit" class="btn"  style="background: chocolate" onclick="hide(${item.getIdBook()})"
                       value="Add to your list">
            <input type="hidden" name="book_id" id ="book_id" value=${item.getIdBook()}>
        </small>
        </form>
            </p>
        </div>
</#list>
</div>
</div>
<script>
    function hide(id) {
        var div = document.getElementById(id);
            div.style.display = "none";
    }
</script>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

</body>