<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Blog Home</title>
    </head>
    <body>
        <h1>Blog Home</h1>
        <ul>
            <#list posts as post>
                <li>
                    <a href="/blog${post.url}">${post.title}</a>
                    <p>${post.publicationDate}</p>
                </li>
            </#list>
        </ul>
    </body>
</html>
