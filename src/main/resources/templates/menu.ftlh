<!doctype html>
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
<div style="width=100%">

    <header class="blog-header py-3" style="background: burlywood; width: 100%">


        <nav class=" navbar row flex-nowrap justify-content-between align-items-center">
            <div class="col-4 pt-1" style="width: 100%">
                <a class="p-2 text-muted" href="/profile">Profile</a>
                <a class="p-2 text-muted" href="/search">Find Book</a>
                <a class="p-2 text-muted" href="#">Find Person</a>
            </div>
            <div class="col-4 text-center" >
                <h1 class="blog-header-logo text-dark" >InBook</h1>
            </div>
            <div class="col-4 d-flex justify-content-end align-items-center ">
                <#--<a class="btn btn-sm btn-outline-secondary">Sign out</a>-->
                    <form class="form-signin "  action="/logout" method="post">

                    <input class="btn btn-sm btn-outline-secondary"  type="submit" value="Sign out">
                    </form>

            </div>
        </nav>

    </header>

</div>

    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>
