<!doctype html>
<#include "menu.ftlh">
<#import "spring.ftl" as spring />

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body style="background: antiquewhite">
<div class="container" style="width=100%">

<div >
    <h2 align="center">${user.getLogin()}</h2>

    <div class="my-3 p-3 bg-white rounded shadow-sm">
        <h6 class="border-bottom border-gray pb-2 mb-0">Read books:</h6>
    <#if (user.getBookList()?size > 0)>
        <div class="media text-muted pt-3">
            <svg class="bd-placeholder-img mr-2 rounded" width="32" height="32" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 32x32"><title>Placeholder</title><rect width="100%" height="100%" fill="#d69c4b"></rect></svg>
            <p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">

                <strong class="d-block text-gray-dark">${user.getBookList()[0].nameOfBook}</strong>
                ${user.getBookList()[0].author}

            </p>
        </div>
</#if>
 <#if (user.getBookList()?size > 1)>
        <div class="media text-muted pt-3">
            <svg class="bd-placeholder-img mr-2 rounded" width="32" height="32" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 32x32"><title>Placeholder</title><rect width="100%" height="100%" fill="#d69c4b"></rect></svg>
            <p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                <strong class="d-block text-gray-dark">${user.getBookList()[1].nameOfBook}</strong>
            ${user.getBookList()[1].author}
            </p>
        </div>
</#if>
 <#if (user.getBookList()?size > 2)>
        <div class="media text-muted pt-3">
            <svg class="bd-placeholder-img mr-2 rounded" width="32" height="32" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 32x32"><title>Placeholder</title><rect width="100%" height="100%" fill="#d69c4b"></rect></svg>
            <p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                <strong class="d-block text-gray-dark">${user.getBookList()[2].nameOfBook}</strong>
            ${user.getBookList()[2].author}
            </p>
        </div>
</#if>

 <#if (user.getBookList()?size > 3)>
        <div id="div" style="display: none">
        <#list user.getBookList()[3 ..< user.getBookList()?size ] as item>
        <div class="media text-muted pt-3" id="booksDiv" >
           <p id="booksSvg" > <svg class="bd-placeholder-img mr-2 rounded"  width="32" height="32" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 32x32"><title>Placeholder</title><rect width="100%" height="100%" fill="#d69c4b"></rect></svg></p>
            <p id="books" class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray" >
                <strong class="d-block text-gray-dark">  ${item.nameOfBook}</strong>
            ${item.author}
            </p>
        </div>
        </#list>
    </div>
</#if>
        <small class="d-block text-right mt-3">
            <p><input type="submit" class="btn"  style="background: chocolate"
                      onclick="moreBooks()" value="More..."></p>
        </small>
    </div>




    <#--<form action="/profile" method="post">-->
        <#--<p><input class="btn btn-lg btn-primary btn-block"  style="background: chocolate" type="submit" value="Change profile"></p>-->
    <#--</form>-->


<script>
    var visible = false;
    function moreBooks() {

        var div = document.getElementById("div");
        if (visible !== true) {
             div.style.display = "block";
            visible = true;
        } else {
            div.style.display = "none";
            visible = false;
        }
    }

    var visible2 = false;
    function moreQuotes() {

        var div = document.getElementById("div2");
        if (visible2 !== true) {
            div2.style.display = "block";
            visible2 = true;
        } else {
            div2.style.display = "none";
            visible2 = false;
        }
    }
</script>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>
