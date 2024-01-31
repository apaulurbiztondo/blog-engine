<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Blog Home</title>
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1>Blog</h1>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Title</th>
                <th>Publication Date</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <#list posts as post>
                <tr>
                    <td>${post.title}</td>
                    <td>${post.publicationDate}</td>
                    <td>
                        <a href="/blog${post.url}" class="btn btn-primary" role="button">View</a>
                    </td>
                </tr>
            </#list>
            </tbody>
        </table>
    </div>

<!-- Bootstrap JS and jQuery -->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
