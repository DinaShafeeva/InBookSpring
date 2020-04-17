<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <link href="signin.css" rel="stylesheet">

</head>
<body style="background: antiquewhite">
<div align="center">
    <form class="form-signin " style="width: 400px; margin-top: 100px" action="/signUp" method="post">
        <h1 class="h3 mb-3 font-weight-normal">Please register</h1>

        <input name="login" class="form-control mb-3" placeholder="Login" required autofocus>
        <p><input name="email"  class="form-control mb-3"  oninput="checkEmail()" id="email" placeholder="Email" required></p>
        <p id="textWrongEmail" style="color: red" hidden >Incorrect e-mail</p>
        <p><input type="password" class="form-control" name="password" id="password" oninput="checkPassword()" placeholder="Password" required></p>
        <p id="textLessThan6" style="color: red" hidden >Password should have more than 6 characters</p>
        <p id="textNumbers" style="color: red" hidden >Password should have numbers</p>
        <p id="textLetters" style="color: red" hidden >Password should have letters</p>
        <p><input type="submit" class="btn btn-lg btn-primary btn-block"  style="background: chocolate"  value="Register"></p>
        <a class="mb-3" href="/signIn">Already have an account?</a>
        <p class="mt-5 mb-3 text-muted">© 2020</p>
    </form>
</div>
<script>
    function checkEmail() {
        var email = document.getElementById("email").value;
        var textWrongEmail = document.getElementById("textWrongEmail");

        if (email.match(/.+@.+\..+/i)) {
            textWrongEmail.hidden = true;
        } else {
            textWrongEmail.hidden = false;
        }
    }

    function checkPassword() {
        var password = document.getElementById("password").value;
        var textLessThan6 = document.getElementById("textLessThan6");
        var textNumbers = document.getElementById("textNumbers");
        var textLetters = document.getElementById("textLetters");
        if (password.length < 6){
            textLessThan6.hidden = false;
        } else {
            textLessThan6.hidden = true;
        }

        if (password.match(/[0-9]/)){
            textNumbers.hidden = true;
        } else {
            textNumbers.hidden = false;
        }

        if (password.match(/[a-z]/) || (password.match(/[а-я]/))){
            textLetters.hidden = true;
        } else {
            textLetters.hidden = false;
        }
    }
</script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>
